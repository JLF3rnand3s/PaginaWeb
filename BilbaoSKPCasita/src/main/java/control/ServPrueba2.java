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
import model.Item;

/**
 * Servlet implementation class ServPrueba
 */
@WebServlet("/prueba2")
public class ServPrueba2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*obtener los items del dataconex*/
		try {
			//llamar al dataconex para obtener las imagenes
			DataConex db = new DataConex();
			//aqui obtienes las imagenes y las guardas en un array
			ArrayList<Item> objetos = db.getItems();
			//las seteas en un attributo que mandaras a un jsp mediante una redireccion
			request.setAttribute("objetos", objetos);

		//redireccionar a el jsp
			request.getRequestDispatcher("indexjuego.jsp?sectjuego=prueba2").forward(request, response);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



}
