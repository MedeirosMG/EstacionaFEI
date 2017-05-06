package fei.estaciona.vaga;

import java.util.HashMap;
import java.util.Map;

public class VagasBD
{
	private static Map<Integer, Vaga> Vagas = new HashMap<Integer, Vaga>();;
	
	public void InsereVaga(int tipo, int id)
	{
		Vaga NovaVaga = new Vaga(tipo);
		Vagas.put(id, NovaVaga);
	}
	
	public Vaga buscaVaga(int id)
	{
		return Vagas.get(id);
	}
}
