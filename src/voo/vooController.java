package voo;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import voo.Voo;
import voo.VooModel;



/**
 * Servlet implementation class VooController
 */
@WebServlet("/VooController")
public class VooController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VooController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
				String acao = request.getParameter("pagina");
				 switch(acao) {
				 case "novo":
					 response.sendRedirect("admin/voo_form_novo.jsp");
			     break;
				   default:
					 
				   break;
				 }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String acao = request.getParameter("acao");
		 switch(acao) {
		 case "create":
			  create(request,response);
	     break;
		   default:
			 
		   break;
		 }
 	}
	
	private void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		Voo v= new Voo();
		v.setAeroporto_destino(Integer.parseInt(request.getParameter("destino")));
		v.setAeroporto_origem(Integer.parseInt(request.getParameter("origem")));
		v.setDisponivel(Integer.parseInt(request.getParameter("assentos")));
		v.setData( request.getParameter("data"));
		v.setHorario(request.getParameter("horario"));
		
		
		try
		{
			VooModel.inserir(v);
			response.sendRedirect("admin/home.jsp");
		}catch(SQLException e) {
			
		}

         
		
		
		
		
 	}
	
	

}
