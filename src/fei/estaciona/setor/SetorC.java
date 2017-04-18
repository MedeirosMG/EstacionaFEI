package fei.estaciona.setor;

import fei.estaciona.vaga.Vaga;

public class SetorC implements Setor {

	private Vaga[] vagas;
	private boolean disponibilidade;
	
	public SetorC()
	{
		this.disponibilidade = true;
		vagas = new Vaga[Setor.MAX];
	}
	
	@Override
	public int[] vagas_Disponiveis() 
	{
		
		int[] ids = new int[Setor.MAX];
		int contador = 0;
		
		for (Vaga vaga : vagas) 
		{
			if(vaga != null)
			{
				ids[contador] = vaga.getId_vaga();
				contador++;
			}
		}
		return ids;
	}

	@Override
	public void alterar_Disponibilidade_Setor(boolean disponivel) 
	{
		this.disponibilidade = disponivel;
	}

	@Override
	public boolean Verifica_Disponibilidade_Setor() 
	{
		return this.disponibilidade;
	}

	@Override
	public void alterar_Disponibilidade_Vaga(boolean disponivel, int id) 
	{
		for (Vaga vaga : vagas) 
		{
			if(vaga != null)
			{
				if(vaga.getId_vaga() == id)
				{
					vaga.setDisponibilidade(disponivel);
				}
			}
		}
	}

	@Override
	public void inserir_Nova_Vaga() 
	{
		if(Verifica_Disponibilidade_Setor() )
		{
			for(int i = 0 ; i < vagas.length ; i++)
			{
				if(vagas[i] == null)
				{
					vagas[i] = new Vaga(1);
					break;
				}
			}
		}
		else
		{
			System.out.println("Setor indiponivel");
		}
	}
}