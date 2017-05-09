package fei.estaciona.setor;

import fei.estaciona.vaga.Vaga;
import fei.estaciona.vaga.VagasBD;

public class SetorFull implements Setor
{

	private int[] id_vagas;
	private boolean disponibilidade;
	int numeroSetor;
	private VagasBD banco_de_vagas = new VagasBD();
	
	public SetorFull(int numSetor)
	{
		this.numeroSetor = 0;
		for(int j = 0; j < numSetor ; j++)
		{
			this.numeroSetor += 16;
		}
		
		this.disponibilidade = true;
		this.id_vagas = new int[MAX];
		
		for(int i = 0 ; i < 16 ; i++)
		{
			if(banco_de_vagas.buscaVaga((i+1) + this.numeroSetor) != null )
			{
				this.id_vagas[i] = ( (i+1) + this.numeroSetor)  ;
			}
			else
			{
				this.id_vagas[i] = -1;
			}
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
				vaga= banco_de_vagas.buscaVaga(id_vagas[i]);
				vagas[i] = vaga.GetTipo();
			}	
		}
		
		return vagas;
	}
	
	@Override
	public int[] idsVagas()
	{
		return this.id_vagas;
	}
	
	@Override
	public int[] vagas_Disponiveis()
	{
		int []vagas = new int[16];
		for(int i = 0 ; i < 16 ; i++)
		{
			if(this.id_vagas[i] != -1)
			{
				Vaga vaga= banco_de_vagas.buscaVaga(id_vagas[i]);
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
					Vaga vaga= banco_de_vagas.buscaVaga(id);
					vaga.setDisponibilidade(disponivel);
				}
			}
		}
	}

	@Override
	public boolean verifica_disponibilidade_vaga(int id)
	{
		Vaga vaga= banco_de_vagas.buscaVaga(id);
		return vaga.verifica_disponibilidade();
	}
	
	@Override
	public boolean inserir_Nova_Vaga(int tipoVaga, int id, int numSetor)
	{
		if(Verifica_Disponibilidade_Setor() )
		{
			int vaga = (id-1) - numSetor;
			
			if(id_vagas[vaga] == -1)
			{
				banco_de_vagas.InsereVaga(tipoVaga, id);
				this.id_vagas[vaga] = id;
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean deletar_vaga(int id,int numSetor)
	{
		int vaga = (id-1) - numSetor;
		
		if(id_vagas[vaga] != -1)
		{
			banco_de_vagas.DeletarVaga(id);
			this.id_vagas[vaga] = -1;
			return true;
		}
		
		return false;
	}
}
