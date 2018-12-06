package cliente;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

import conexao.ConexaoMysql;
import usuario.Usuario;
import cliente.Endereco;
import cliente.Cartao;


public class ClienteModel {
	
	public static void inserir(Cliente cli) throws SQLException {
		Connection conexao = ConexaoMysql.getConnection();

		int keyUsuario =0;
		int keyCliente =0;
		Usuario usu = cli.getUsuario();
		Endereco end = cli.getEndereco();
		Cartao car = cli.getCartao();
		
		String sqlUsuario = "INSERT INTO usuario (login,senha,tipo) VALUES (?,?,?)";
		String sqlCliente = "INSERT INTO cliente (nome,sobrenome,nascimento,usuario_id) VALUES (?,?,?,?)";
		String sqlEndereco = "INSERT INTO endereco (cep,logradouro,numero,complemento,bairro,cidade,uf,cliente_id) VALUES (?,?,?,?,?,?,?,?)";
		String sqlCartao= "INSERT INTO cartao (numero,validade,cod_seguranca,cliente_id) VALUES (?,?,?,?)";


		try {
			
			PreparedStatement psUsu = conexao.prepareStatement(sqlUsuario, Statement.RETURN_GENERATED_KEYS);
			psUsu.setString(1, usu.getLogin());
			psUsu.setString(2, usu.getSenha());
			psUsu.setString(3, usu.getTipo());
			psUsu.execute();
	
			ResultSet rsUsu = psUsu.getGeneratedKeys();
			if (rsUsu.next()){
			     keyUsuario =rsUsu.getInt(1);
			}
			
			
			PreparedStatement psCli = conexao.prepareStatement(sqlCliente, Statement.RETURN_GENERATED_KEYS);
			psCli.setString(1,cli.getNome());
			psCli.setString(2, cli.getSobrenome());
			psCli.setString(3, cli.getData_nascimento());
			psCli.setInt(4, keyUsuario);
			psCli.execute();
			
			ResultSet rsCli = psCli.getGeneratedKeys();
			if (rsCli.next()){
			     keyCliente =rsCli.getInt(1);
			}
			
			
			PreparedStatement psEnd = conexao.prepareStatement(sqlEndereco);
			psEnd.setString(1,end.getCep());
			psEnd.setString(2, end.getLogradouro());
			psEnd.setInt(3, end.getNumero());
			psEnd.setString(4, end.getComplemento());
			psEnd.setString(5, end.getBairro());
			psEnd.setString(6, end.getCidade());
			psEnd.setString(7, end.getUf());
			psEnd.setInt(8, keyCliente);
			psEnd.execute();
	
			PreparedStatement psCart = conexao.prepareStatement(sqlCartao);
			psCart.setString(1,car.getNumero());
			psCart.setString(2, car.getValidade());
			psCart.setInt(3, car.getCodigo());
			psEnd.setInt(4, keyCliente);
			psEnd.execute();
	
			
			conexao.commit();
			
		} catch (SQLException e) {
			// Erro, provoca um Rollback (volta ao estado anterior do banco)
			conexao.rollback();
			e.printStackTrace();
			throw new SQLException();
		} finally {
			// fechar a conex�o
			conexao.close();
		}
	}
	

}
