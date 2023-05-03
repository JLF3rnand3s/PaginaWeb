package control;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import model.DataConex;
import model.Item;

/**
 * Servlet implementation class ServPrueba
 */
@WebServlet("/prueba")
public class ServPrueba extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {

			//Crear objeto HttpSession para obtener la sesion del usuario
			HttpSession sesion=request.getSession();
			//al objeto ArrayList le añadimos el objeto sesion para verificar los objetos que tiene dentro
			ArrayList<Item> objetos = (ArrayList<Item>) sesion.getAttribute("objetos");
			//redireccion al jsp de prueba
			request.getRequestDispatcher("indexjuego.jsp?sectjuego=prueba").forward(request, response);		
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
