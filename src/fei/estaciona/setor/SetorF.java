package fei.estaciona.setor;

import java.util.Random;

import fei.estaciona.vaga.Vaga;

public class SetorF implements Setor
{

	private int[] id_vagas;
	private boolean disponibilidade;
	
	public SetorF()
	{
		this.disponibilidade = true;
		this.id_vagas = new int[MAX];
		Random r = new Random();
		int randomInt;
		
		for (int i = 0 ; i < this.id_vagas.length ; ++i) 
		{
			this.id_vagas[i] = -1;
			randomInt = r.nextInt(3) + 1;
			inserir_Nova_Vaga(randomInt);
		}
	}
	
	@Override
	public String[] tipoVagas()
	{
		String []vagas = new String[16];
		Vaga vaga;
		for(int i = 0 ; i < 16 ; ++i)
		{
			if(id_vagas[i] != -1)
			{
				vaga= Setor.banco_de_vagas.buscaVaga(id_vagas[i]);
				vagas[i] = vaga.GetTipo();
			}
		}
		
		return vagas;
	}
	
	@Override
	public int[] vagas_Disponiveis()
	{
		int []vagas = new int[16];
		for(int i = 0 ; i < 16 ; i++)
		{
			if(this.id_vagas[i] != -1)
			{
				Vaga vaga= Setor.banco_de_vagas.buscaVaga(i+1);
				if(vaga.verifica_disponibilidade())
					vagas[i] = 1;
				else
					vagas[i] = 0;
			}
			else
			{
				vagas[i] = -1;
			}
		}
		
		return vagas;
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
					Vaga vaga= Setor.banco_de_vagas.buscaVaga(id);
					vaga.setDisponibilidade(disponivel);
				}
			}
		}
	}

	@Override
	public boolean verifica_disponibilidade_vaga(int id)
	{
		Vaga vaga= Setor.banco_de_vagas.buscaVaga(id);
		return vaga.verifica_disponibilidade();
	}
	
	@Override
	public int inserir_Nova_Vaga(int tipoVaga)
	{
		if(Verifica_Disponibilidade_Setor() )
		{
			for(int i = 0 ; i < id_vagas.length ; i++)
			{
				if(id_vagas[i] == -1)
				{
					int NovaVaga = Setor.banco_de_vagas.InsereVaga(tipoVaga);
					this.id_vagas[i] = NovaVaga;
					return NovaVaga;
				}
			}
		}
		return -1;
	}
}