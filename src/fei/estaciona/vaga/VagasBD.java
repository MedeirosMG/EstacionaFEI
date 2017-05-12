package fei.estaciona.vaga;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import fei.estaciona.BD.ConectaBD;

public class VagasBD
{
	private static Map<Integer, Vaga> Vagas = new HashMap<Integer, Vaga>();;
	private static ConectaBD BD = null;
	
	public VagasBD()
	{
		if(BD == null)
		{
			BD =  new ConectaBD();
			Connection conexao = BD.conectar();
			ResultSet rs = BD.Select("SELECT * FROM VAGA",conexao);
			if(rs != null)
			{
				try {
					while (rs.next()){
					     int id = rs.getInt(1);
					     boolean disponibilidade = rs.getBoolean(2);
					     int tipo = rs.getInt(3);
					     
					     Vaga NovaVaga = new Vaga(tipo);
					     Vagas.put(id, NovaVaga);
					     NovaVaga.setDisponibilidade(disponibilidade);
					 }
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally
				{
					BD.desconectar(conexao);
				}
			}
		}
	}
	
	public void InsereVaga(int tipo, int id)
	{
		Connection conn = BD.conectar();
		if(BD.Insert(id, tipo, conn) )
		{
			Vaga NovaVaga = new Vaga(tipo);		
			Vagas.put(id, NovaVaga);	
		}
		BD.desconectar(conn);
	}
	
	public void DeletarVaga(int id)
	{
		Connection conn = BD.conectar();
		if(BD.Delete(id, conn))
		{
			Vagas.remove(id);
		}
		BD.desconectar(conn);
	}
	
	public String VerificaTipoVaga(int tipo)
	{
		Connection conn = BD.conectar();
		ResultSet rs = BD.SelectTipo(tipo,conn);
		try {
			while (rs.next()){
				return rs.getString(2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			BD.desconectar(conn);
		}
		return "";
	}
	
	public void AlteraDisponibilidade(boolean disponibilidade, int id_vaga)
	{
		Connection conn = BD.conectar();
		BD.Update(disponibilidade, id_vaga, conn);
		BD.desconectar(conn);
	}
	
	public Vaga buscaVaga(int id)
	{
		return Vagas.get(id);
	}
}

