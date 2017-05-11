package fei.estaciona.vaga;

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
			ResultSet rs = BD.Select("SELECT * FROM VAGA");
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
			}
		}
	}
	
	public void InsereVaga(int tipo, int id)
	{
		if(BD.Insert(id, tipo) )
		{
			Vaga NovaVaga = new Vaga(tipo);		
			Vagas.put(id, NovaVaga);	
		}
	}
	
	public void DeletarVaga(int id)
	{
		if(BD.Delete(id))
		{
			Vagas.remove(id);
		}
	}
	
	public String VerificaTipoVaga(int tipo)
	{
		ResultSet rs = BD.SelectTipo(tipo);
		try {
			while (rs.next()){
				return rs.getString(2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	public void AlteraDisponibilidade(boolean disponibilidade, int id_vaga)
	{
		BD.Update(disponibilidade, id_vaga);
	}
	
	public Vaga buscaVaga(int id)
	{
		return Vagas.get(id);
	}
}

