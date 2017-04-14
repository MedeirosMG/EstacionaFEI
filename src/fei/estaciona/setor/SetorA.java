package fei.estaciona.setor;

import fei.estaciona.vaga.Vaga;

public class SetorA implements Setor {

	private Vaga[] vagas;
	private boolean disponibilidade;
	
	public SetorA()
	{
		this.disponibilidade = true;
		vagas = new Vaga[Setor.MAX];
	}
	
	@Override
	public int[] vagas_Disponiveis() {
		
		int[] numeros = new int[Setor.MAX];
		int contador = 0;
		
		for (Vaga vaga : vagas) 
		{
			if(vaga != null)
			{
				numeros[contador] = vaga.getId_vaga();
				contador++;
			}
		}
		return numeros;
	}

	@Override
	public void alterar_Disponibilidade_Setor(boolean disponivel) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean Verifica_Disponibilidade_Setor() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void alterar_Disponibilidade_Vaga(boolean disponivel, int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void inserir_Nova_Vaga() {
		// TODO Auto-generated method stub
		
	}

}