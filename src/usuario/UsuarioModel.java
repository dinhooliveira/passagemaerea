package usuario;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conexao.ConexaoMysql;
import usuario.Usuario;


public class UsuarioModel {

	public static Usuario login(String login, String senha) throws SQLException {
		Connection conexao = ConexaoMysql.getConnection();
		String sql = "SELECT * FROM usuario where login = '"+login+"' and senha='"+senha+"'; ";

		 Usuario usuario  = new Usuario();
		try {
			PreparedStatement ps = conexao.prepareCall(sql);
			
			ResultSet rs = ps.executeQuery();
			rs.next();
			usuario.setLogin(rs.getString("login"));
			usuario.setSenha(rs.getString("senha"));
			usuario.setTipo(rs.getString("tipo"));
			conexao.commit();
		} catch (SQLException e) {
			// Erro, provoca um Rollback (volta ao estado anterior do banco)
			conexao.rollback();
		} finally {
			// fechar a conex�o
			conexao.close();
		}
		
		
		return usuario;
		
	}
}
