package usuario;

import java.sql.SQLException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import usuario.UsuarioModel;
import usuario.Usuario;
/**
 * Servlet implementation class UsuarioController
 */
@WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao  = request.getParameter("pagina");
			
			switch(acao){
				case "logout":
				logout(request,response);
			    break;
			    default:
			    break;
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao  = request.getParameter("acao");
		
		switch(acao){
			case "login":
			login(request,response);
		    break;
		    default:
		    break;
		}
	}
	
	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			PrintWriter  out = response.getWriter();
			
			Usuario usuario = UsuarioModel.login(request.getParameter("login"), request.getParameter("senha"));
			
			if( usuario.getLogin() != null && usuario.getSenha() != null &&  usuario.getTipo().equals("ADMIN")) {
			HttpSession session = request.getSession();
	        session.setAttribute("usuario",usuario);
		     response.sendRedirect("admin/home.jsp");

            }else if(null != usuario.getLogin() && null != usuario.getSenha()){
            	out.print("<h1>cliente</h1>");
            }else {
            	response.sendRedirect("login.jsp");
            }
		}catch(SQLException e) {
			
		}
	}
	
	private void logout(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		response.sendRedirect("login.jsp");
		
	}
	
	
	

}
