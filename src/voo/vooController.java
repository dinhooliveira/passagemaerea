package voo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.sql.SQLException;
import java.util.List;

import voo.VooModel;

/**
 * Servlet implementation class vooController
 */
@WebServlet("/vooController")
public class vooController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private VooModel vooM;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public vooController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.print(request.getParameter("pagina"));

		switch (request.getParameter("pagina")) {
		case "novo":
			response.sendRedirect("admin/voo_form_novo.jsp");
			break;
		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
		 String action = request.getServletPath();
		 

	        try {
	            switch (action) {
	            case "/new":
	            break;
	      
	            default:
	                showNewForm(request, response);	               
	            break;
	            }
	        } catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
	        
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		List<Aeroporto> aeroP = vooM.listAeroPorto();
	    request.setAttribute("ListAeroP", aeroP);
		RequestDispatcher dispatcher = request.getRequestDispatcher("voo_form_novo.jsp");
		dispatcher.forward(request, response);
	}

}
