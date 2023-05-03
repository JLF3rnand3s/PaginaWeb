package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class DataConexGeneric {
	public static final String DRIVER_MYSQL_OLD="com.mysql.jdbc.Driver";
	public static final String DRIVER_GEN="sun.jdbc.odbc.JdbcOdbcDriver";
	public static final String DRIVER_MYSQL="com.mysql.cj.jdbc.Driver";
	String dbURL,user,pass,driver;
	Connection con =null;
	Statement st = null;
	ResultSet rs = null;
	PreparedStatement pst = null;
	Vector<String>infoTabla2;
	Vector<Vector>infoTabla;
	
	public DataConexGeneric(String dbURL, String user, String pass, String driver) throws ClassNotFoundException, SQLException {
		super();
		this.dbURL = dbURL;
		this.user = user;
		this.pass = pass;
		this.driver = driver;
	}
	
	public DataConexGeneric() {
	}

	public void conectar(String dbURL, String user, String pass, String driver) throws ClassNotFoundException, SQLException {		
		
		switch (driver) {
		case DRIVER_MYSQL:
			Class.forName(DRIVER_MYSQL); 
			con = DriverManager.getConnection("jdbc:mysql://"+dbURL,user,pass);
			System.out.println("Conexion realizada");
			break;
		}
	}
	
	public void desconectar() throws SQLException {
		con.close();
		con = null;
		System.out.println("Desconexion realizada");
	};
	
	public void abrirFlujo() throws SQLException {st= con.createStatement();}
	
	public void cerrarFlujo() throws SQLException {st.close();st=null;}
	
	public String lanzarSQL(String query) throws SQLException {
		String resultado=null;
		st= con.createStatement();
		st.executeUpdate(query);
		st.close();st=null;
		System.out.println("Query Lanzada");
		return resultado;
	};
	
	public static void escribirContenidoRS(ResultSet rs) throws SQLException {
			ResultSetMetaData rsmd = rs.getMetaData();
			int numColumnas = rsmd.getColumnCount();
			String cabecera="";
			for (int i = 1; i <= numColumnas; i++) {
				cabecera+= rsmd.getColumnName(i)+"("+rsmd.getColumnTypeName(i)+")"+" | ";
			}
			System.out.println(cabecera);
			System.out.println("------------------------------------------------------------------------------------");
			
			while(rs.next()) {
				String linea="";
				for (int i = 1; i <= numColumnas; i++) {
					linea+= rs.getString(i)+" | ";
				}
				System.out.println(linea);
			}
			}
	public Vector<String> columnasTabla(String sql)throws SQLException {
		abrirFlujo();
		rs = st.executeQuery(sql);
		ResultSetMetaData rsmd = rs.getMetaData();
		int numColumnas = rsmd.getColumnCount();
		Vector<String> cabeceraTabla = new Vector<String>();
		cabeceraTabla.add("posicion");
		String nombreColumna="";
		for (int i = 1; i <= numColumnas; i++) {
			nombreColumna= rsmd.getColumnName(i);
			cabeceraTabla.add(nombreColumna);
		}cerrarFlujo();
		return cabeceraTabla;
		}
public Vector<Vector> infoTabla(String sql)throws SQLException {
	abrirFlujo();
	rs = st.executeQuery(sql);
	ResultSetMetaData rsmd = rs.getMetaData();
	int numColumnas = rsmd.getColumnCount();
	infoTabla = new Vector<Vector>();
	int posicion = 0;
	while(rs.next()) {
		infoTabla2 = new Vector<String>();
		posicion=posicion+1;
		String infoColumna=""+posicion;
		infoTabla2.add(infoColumna);
		infoColumna="";
		for (int i = 2; i <= numColumnas+1; i++) {
			infoColumna= rs.getString(i-1);
			infoTabla2.add(infoColumna);
		}infoTabla.add(infoTabla2);
	}cerrarFlujo();
	return infoTabla;
}
	
}
