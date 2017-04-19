package fei.estaciona.setor;

import fei.estaciona.vaga.Vaga;

public class SetorA implements Setor 
{

	private int[] id_vagas;
	private boolean disponibilidade;
	
	public SetorA()
	{
		this.disponibilidade = true;
		this.id_vagas = new int[MAX];
		
		for (int i = 0 ; i < this.id_vagas.length ; ++i) 
		{
			this.id_vagas[i] = -1;
		}
	}
	
	@Override
	public int[] vagas_Disponiveis() 
	{
		int[] disponiveis = new int[MAX];
		int contador = 0;
		for (int i : id_vagas) {
			if(i != -1)
			{
				disponiveis[contador] = i;
				++contador;
			}
		}
		return disponiveis;
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
		for (int i  : this.id_vagas) 
		{
			if(i != -1)
			{
				if(id == i)
				{
					
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