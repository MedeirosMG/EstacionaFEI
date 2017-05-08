package fei.estaciona.vaga;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import fei.estaciona.BD.ConectaBD;

public class VagasBD
{
	private static Map<Integer, Vaga> Vagas = new HashMap<Integer, Vaga>();;
	private ConectaBD BD = new ConectaBD();
	
	public VagasBD()
	{
		BD.conectar();
		ResultSet rs = BD.select();
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
		 BD.desconectar();
	}
	
	public void InsereVaga(int tipo, int id)
	{
		Vaga NovaVaga = new Vaga(tipo);
		Vagas.put(id, NovaVaga);
	}
	
	public void DeletarVaga(int id)
	{
		Vagas.remove(id);
	}
	
	public Vaga buscaVaga(int id)
	{
		return Vagas.get(id);
	}
}
