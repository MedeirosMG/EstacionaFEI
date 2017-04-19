package fei.estaciona.vaga;

import java.util.HashMap;
import java.util.Map;

public class VagasBD
{
	private static Map<Integer, Vaga> Vagas = new HashMap<Integer, Vaga>();;
	private static int id_geral;
	
	public VagasBD(){
		VagasBD.id_geral = 0;
	}
	
	public int InsereVaga(int tipo)
	{
		++VagasBD.id_geral;
		Vaga NovaVaga = new Vaga(tipo);
		Vagas.put(VagasBD.id_geral, NovaVaga);
		
		return VagasBD.id_geral;
	}
	
	public Vaga buscaVaga(int id)
	{
		return Vagas.get(id);
	}
}
