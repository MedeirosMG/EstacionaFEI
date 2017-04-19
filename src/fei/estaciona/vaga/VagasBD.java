package fei.estaciona.vaga;

import java.util.HashMap;
import java.util.Map;

import fei.estaciona.setor.Setor;

public class VagasBD
{
	private static Map<Integer, Vaga> Vagas = new HashMap<Integer, Vaga>();;
	
	public VagasBD(){}
	
	public void InsereVaga(int Id, int tipo)
	{
		Vaga NovaVaga = new Vaga(tipo);
		Vagas.put(Id, NovaVaga);
	}
	
	public void imprimeVaga(int id)
	{
		Vaga nova = Vagas.get(id);
		if(nova != null)
			System.out.println(nova.GetTipo());
	}
}
