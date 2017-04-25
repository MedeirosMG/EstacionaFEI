package fei.estaciona.setor;

import fei.estaciona.vaga.Vaga;

public class SetorF implements Setor 
{

	private int[] id_vagas;
	private boolean disponibilidade;
	
	public SetorF()
	{
		this.disponibilidade = true;
		this.id_vagas = new int[MAX];
		
		for (int i = 0 ; i < this.id_vagas.length ; ++i) 
		{
			this.id_vagas[i] = -1;
		}
	}
	
	@Override
	public boolean[] vagas_Disponiveis() 
	{
		boolean []novo = {true, false};
		return novo;
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
	public void inserir_Nova_Vaga(int tipoVaga) 
	{
		if(Verifica_Disponibilidade_Setor() )
		{
			for(int i = 0 ; i < id_vagas.length ; i++)
			{
				if(id_vagas[i] == -1)
				{
					System.out.println("Qual o tipo de vaga a ser cadastrada ?\n");
					int valida = Setor.tipos.GetTiposDiferentes();
				//int tipoVaga = Setor.leitor.nextInt();
					
					if(tipoVaga <= valida)
					{
						int NovaVaga = Setor.banco_de_vagas.InsereVaga(tipoVaga);
						this.id_vagas[i] = NovaVaga;
					}
					else
					{
						System.out.println("Tipo invalido");
					}
					
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