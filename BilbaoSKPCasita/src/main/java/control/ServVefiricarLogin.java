package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DataConex;
import model.Usuario;

/**
 * Servlet implementation class ServLogin
 */
@WebServlet("/verificar-login")
public class ServVefiricarLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doPost(request,response);
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//			doGet(request,response);
		PrintWriter out = response.getWriter();	
		


			/*________________________________________________INICIAR SESION_____________________________________________________*/
			
		//obtenemos los parametros del formulario del login.jsp

				try {
					String usuario = request.getParameter("user");
					String contra = request.getParameter("pass");
					
					/*Llamamos a la clase DataConex*/
					DataConex db = new DataConex();
					db.abrirFlujo();
					//verificamos si existe el usuario
					Usuario u = db.validarUsuario(usuario, contra);
						
							if(u != null) {
								//si existe, pillamos la sesion del usuario
								HttpSession session = request.getSession(true);
								//solicitar sesion
								session = request.getSession();
								//le metemos un atributo el cual lo pillaremos en el "login.jsp"
								session.setAttribute("usuario", u);
								//Redireccionamos al inicio si existe el usuario
								request.getRequestDispatcher("index.jsp?sect=inicio").forward(request, response);
							}else {
								//si no existe...
								//estaria bueno realizar "popups" para saber que no hay un usuario
								request.getRequestDispatcher("index.jsp?sect=login").forward(request, response);				
								}
							
				} catch (ClassNotFoundException | SQLException e) {
					request.getRequestDispatcher("index.jsp?sect=login").forward(request, response);				
					System.out.println("Error: "+e);
				}
				
				
			/*________________________________________________ SUSCRIBIRSE _____________________________________________________*/
				
				/*Llamamos a la clase DataConex*/

				
				try {
					//estaria bueno realizar "popups" para saber que hay un usuario con ese nick ya 
						   DataConex db = new DataConex();

					String nombre = request.getParameter("nameSus");
					String apellido = request.getParameter("lastSus");
					String user = request.getParameter("userSus");
					String contra = request.getParameter("pasSus");
					String mail = request.getParameter("mail");
					Date fechaNac = Date.valueOf(request.getParameter("fechaNac"));

				
					/*Llamamos a la clase DataConex*/
				
					db.abrirFlujo();
					 if (db.existeUsuario(user)) {
					        // El usuario ya existe, mostramos un mensaje de error al usuario
					        db.cerrarFlujo();  
					 }else {
						 
					
					//verificamos si existe el usuario
						db.crearInsert(nombre, apellido, user, contra, mail, fechaNac);
				
					request.getRequestDispatcher("index.jsp?sect=inicio").forward(request, response);
					 }
						db.cerrarFlujo();
							} catch (ClassNotFoundException | SQLException e) {
					System.out.println("Error: "+e);
				}
				
	
	
	}

}
