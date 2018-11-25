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

		String sql = "INSERT INTO voo (aeroporto_origem_id,aeroporto_destino_id,disponivel,data,horario) VALUES (?,?,?,?,?)";

		try {
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, voo.getAeroporto_origem());
			ps.setInt(2, voo.getAeroporto_destino());
			ps.setInt(3, voo.getDisponivel());
			ps.setString(4, voo.getData());
			ps.setString(5, voo.getHorario());
			
			
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
	

	public static List<Voo>  listaVoo() throws SQLException {
		
		Connection conexao = ConexaoMysql.getConnection();
		List<Voo> ListVoo = new ArrayList<>();
		String sql = " SELECT"+
				" voo.*," + 
				" origem.id as  origem_id," + 
				" origem.nome as origem," + 
				" destino.id as destino_id," + 
				" destino.nome as destino" + 
				" FROM voo" + 
				" INNER JOIN aeroporto as origem ON (origem.id  = voo.aeroporto_origem_id)" + 
				" INNER JOIN aeroporto as destino ON (destino.id  = voo.aeroporto_destino_id)"+
				" ORDER BY voo.id DESC";

		try {
			PreparedStatement ps = conexao.prepareCall(sql);
			
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next()){
			    Voo v = new Voo();
			    v.setId(Integer.parseInt(rs.getString("id")));
				v.setData(rs.getString("data"));
				v.setDestino(rs.getString("destino"));
				v.setHorario(rs.getString("horario"));
				v.setOrigem(rs.getString("origem"));
				v.setDisponivel(rs.getInt("disponivel"));
				ListVoo.add(v);
               
			}
			
			
			
			conexao.commit();
		} catch (SQLException e) {
			// Erro, provoca um Rollback (volta ao estado anterior do banco)
			conexao.rollback();
		} finally {
			// fechar a conex�o
			conexao.close();
		}
		
		return ListVoo;
		
	}
}
