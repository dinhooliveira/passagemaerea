package cliente;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cliente.Cartao;
import cliente.Endereco;
import cliente.Cliente;
import cliente.ClienteModel;
import usuario.Usuario;

/**
 * Servlet implementation class ClienteController
 */
@WebServlet("/ClienteController")
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClienteController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("pagina");
		switch (acao) {
		case "cadastro":
			response.sendRedirect("cadastro_cliente.jsp");
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
		String acao = request.getParameter("acao");
		 switch(acao) {
		 case "create":
			  create(request,response);
	     break;
		   default:
			 
		   break;
		 }
	}

	private void create(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			Cliente cli = new Cliente();
			cli.setNome(request.getParameter("nome"));
			cli.setSobrenome(request.getParameter("sobrenome"));
			cli.setData_nascimento(request.getParameter("nascimento"));
			
			Endereco end  = new Endereco();
			end.setCep(request.getParameter("cep"));
			end.setLogradouro(request.getParameter("logradouro"));
			end.setNumero(Integer.parseInt(request.getParameter("numero")));
			end.setComplemento(request.getParameter("complemento"));
			end.setBairro(request.getParameter("bairro"));
			end.setCidade(request.getParameter("cidade"));
			end.setUf(request.getParameter("uf"));
			cli.setEndereco(end);
			
			Cartao cart = new Cartao();
			cart.setNumero(request.getParameter("numero"));
			cart.setCodigo(Integer.parseInt(request.getParameter("numerocartao")));
			cart.setValidade(request.getParameter("validade"));
			cli.setCartao(cart);
			
			Usuario usu = new Usuario();
			usu.setLogin(request.getParameter("login"));
			usu.setSenha(request.getParameter("senha"));
			usu.setTipo("cliente");
			
			cli.setUsuario(usu);
			
		    ClienteModel cliModel = new ClienteModel();
		    cliModel.inserir(cli);
		    response.sendRedirect("admin/home.jsp");
		

		} catch (SQLException e) {
			 response.sendRedirect("erro.jsp");
		}
	}

}
