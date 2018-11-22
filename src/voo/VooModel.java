package voo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import conexao.ConexaoMysql;
import voo.Voo;
import voo.Aeroporto;

public class VooModel {
	
	public static void inserir(Voo voo) throws SQLException {
		Connection conexao = ConexaoMysql.getConnection();

		String sql = "INSERT INTO voo (aeroporto_origem,aeroporto_destino,disponivel,data,horario) VALUES (?,?,?,?)";

		try {
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, voo.getAeroporto_origem());
			ps.setInt(2, voo.getAeroporto_destino());
			ps.setInt(3, voo.getDisponivel());
			ps.setString(4, voo.getData().toString());
			ps.setString(5, voo.getHorario().toString());
			
			
			ps.execute();
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
	
	public static List<Aeroporto>  listAeroPorto() throws SQLException {
		Connection conexao = ConexaoMysql.getConnection();
		List<Aeroporto> ListAeroporto = new ArrayList<>();
		String sql = "SELECT * FROM aeroporto";

		try {
			PreparedStatement ps = conexao.prepareCall(sql);
			
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next()){
			    Aeroporto aero = new Aeroporto();
				aero.setNome(rs.getString("nome"));
				aero.setCidade(rs.getString("cidade"));
				aero.setId(Integer.parseInt(rs.getString("id")) );
				ListAeroporto.add(aero);
               
			}
			
			
			
			conexao.commit();
		} catch (SQLException e) {
			// Erro, provoca um Rollback (volta ao estado anterior do banco)
			conexao.rollback();
		} finally {
			// fechar a conex�o
			conexao.close();
		}
		
		return ListAeroporto;
		
	}
	

}
