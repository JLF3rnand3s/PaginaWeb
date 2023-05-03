package model;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;


public class DataConex extends DataConexGeneric {

	public DataConex() throws ClassNotFoundException, SQLException {
		super();
		super.conectar("localhost:3306/bdbilbaoskp", "root", "", DataConexGeneric.DRIVER_MYSQL);
	}
	
	public void crearInsert(String name,String lastName,String user,String mail ,String pass ,Date fechaNac) throws SQLException {
		String insertTableSQL = "INSERT INTO usuario"
                + "(nombre,apellido,gmail,password,nickname,fechaNac) VALUES"
                + "(?,?,?,?,?,?)";

        try {
        	abrirFlujo();
        	   pst = con.prepareStatement(insertTableSQL);
        	   pst.setString(1, name);
        	   pst.setString(2, lastName);
        	   pst.setString(3, mail);
        	   pst.setString(4, pass);
        	   pst.setString(5, user);
        	   pst.setDate(6, fechaNac);
              
        	   int retorno = pst.executeUpdate();
               if (retorno>0)
                  System.out.println("Insertado correctamente");     
              
        }  catch (SQLException sqle){
                System.out.println("SQLState: " 
                   + sqle.getSQLState());
                System.out.println("SQLErrorCode: " 
                   + sqle.getErrorCode());
                sqle.printStackTrace();
        } 
	}

	public Usuario validarUsuario(String username, String password) throws SQLException {
	System.out.println("Conectado a la bd");
		String sql = "Select * from usuario where nickname='" + username + "' and password='"+password+"';";
		abrirFlujo();
		rs = st.executeQuery(sql);
		Usuario u = null;
		while (rs.next()) {
			u = new Usuario(rs.getString("nombre"),rs.getString("apellido"), rs.getString("nickname"), rs.getString("gmail"), 0); //nombres de las columnas de la BD
		}	
		cerrarFlujo();
		System.out.println("Usuarios obtenidos");
		return u;
	}
	

	/*Consulta del ranking para la sala 1*/
	 public ArrayList<Usuario> obtenerRanking() {
		 //Crear arraylist para los usuarios
	        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
	        try {
	            // consulta
	            String sql = "SELECT u.nickname, p.puntuacion FROM usuario u, partida p, sala s "
	                    + "WHERE u.idUsuario = p.idUsuario AND p.idSala = s.idSala AND s.idSala LIKE 'SA01';";
	        	//abrimos la conexion con la bd
	            abrirFlujo();
	            //ejecutamos la setencia sql
	            rs = st.executeQuery(sql);
	         
	            // mientras hayan resultados, guardamos lel resultado en una lista
	            while (rs.next()) {
	            	//solicitamos los datos "nickname" y "puntuacion
	                Usuario user = new Usuario(null, null, rs.getString("nickname"), null, rs.getInt("puntuacion"));
	              //añadimos a la lista
	         System.out.println(user);
	                listaUsuarios.add(user);
	            }

	            // Cerrar la conexion
	         cerrarFlujo();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        //devolemos la lista de usuario
	        return listaUsuarios;
	    }
	
	/*Consulta del ranking para la sala 2*/
	 public ArrayList<Usuario> obtenerRanking2() {
		 //Crear arraylist para los usuarios
	        ArrayList<Usuario> listaUsuarios2 = new ArrayList<>();
	        try {
	            // consulta
	            String sql = "SELECT u.nickname, p.puntuacion FROM usuario u, partida p, sala s "
	                    + "WHERE u.idUsuario = p.idUsuario AND p.idSala = s.idSala AND s.idSala LIKE 'SA02';";
	        	//abrimos la conexion con la bd
	            abrirFlujo();
	            //ejecutamos la setencia sql
	            rs = st.executeQuery(sql);
	         
	            // mientras hayan resultados, guardamos lel resultado en una lista
	            while (rs.next()) {
	            	//solicitamos los datos "nickname" y "puntuacion
	                Usuario user2 = new Usuario(null, null, rs.getString("nickname"), null, rs.getInt("puntuacion"));
	              //añadimos a la lista
	         System.out.println(user2);
	                listaUsuarios2.add(user2);
	            }

	            // Cerrar la conexion
	         cerrarFlujo();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        //devolemos la lista de usuario
	        return listaUsuarios2;
	    }
/*confirmar existencia del usuario*/
	   public boolean existeUsuario(String nombreUsuario) throws SQLException {
		   /*query del usuario*/
	        pst = con.prepareStatement("SELECT nickname FROM usuario WHERE nickname = ?");
	        pst.setString(1, nombreUsuario);
	       /*ejecutamos*/
	        rs = pst.executeQuery();
	        /*devolvemos el resultset*/
	        return rs.next();
	    }
	   /*Obtener los items de la base de datos*/
		public ArrayList<Item> getItems() throws SQLException{
			//abrir flujo de la base de datos
			abrirFlujo();
			System.out.println("Conectado a la base de datos my G");
			//creamos el objeto Array de la clase Item
			ArrayList<Item> objetos  = new ArrayList<Item>();
			//Sting de la query de sql que ejecutaremos adelante
			String sql = "SELECT nombre, url, descripcion FROM imagen WHERE	idSala = 'SA01'";
			//ejecutamos la query
			rs = st.executeQuery(sql);
			System.out.println("sql lanzada");
			//MIENTRAS hayan resultados, añade el resultado obtenido de la consulta de sql y las añade a el array "objeto"
			while(rs.next()) {
				Item i = new Item(rs.getString("url"), rs.getString("nombre"), rs.getString("descripcion"));
				//añadir resultados a array "objetos"
				objetos.add(i);
			System.out.println("item seleccionado");
			}
			st.close();
			//cerrarFlujo();
			return objetos;
		}
	   
}
