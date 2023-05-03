package control;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DataConex;
import model.Usuario;

/**
 * Servlet implementation class ServEscape
 */
@WebServlet("/escape")
public class ServEscape extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*Enviar ranking 1 y 2*/
		try {
			DataConex db;
			db = new DataConex();		
			/*Ranking 1, Perdida en la jungla*/
			ArrayList<Usuario> listaUsarios = db.obtenerRanking(); 	
			/*Ranking 2, Asilo Abandonado*/
			ArrayList<Usuario> listaUsarios2 = db.obtenerRanking2(); 	
			/*Lista de usuarios 1, escape = Perdida en la jungla*/
			request.setAttribute("listaUsuarios", listaUsarios);
			/*Lista de usuarios 2, escape = Asilo Abandonado*/
			request.setAttribute("listaUsuarios2", listaUsarios2);

			/*Realizar redireccion a la seccion del escape*/
			request.getRequestDispatcher("index.jsp?sect=escape").forward(request, response);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("error manin: "+e);
		}
		
	

	}

}
