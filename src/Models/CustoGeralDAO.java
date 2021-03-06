package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustoGeralDAO {
	public boolean insertCusto(CustoGeralVO custo) {
		Connection conexao =  ConexaoDb.getConexao();
		String sql = "insert into CustoGeral (Descricao, ValorCusto) values (?,?)";
		PreparedStatement pst;
		try {
			pst = conexao.prepareStatement(sql);
			pst.setString(1, custo.getDescricao() );
			pst.setFloat(2, custo.getvalorCusto());
			int adicionado = pst.executeUpdate();
			return adicionado > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	public ArrayList<CustoGeralVO> getListaCustos() {
		ArrayList<CustoGeralVO> lista = new ArrayList<CustoGeralVO>();
		Connection conexao =  ConexaoDb.getConexao();
		String sql = "select * from Maquinas";	
		try {
			PreparedStatement pst = conexao.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				CustoGeralVO custo = new CustoGeralVO(rs.getInt("Id"),rs.getString("Descricao"),rs.getFloat("ValorCusto"));
				lista.add(custo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
		
	}
}
