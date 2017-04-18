package fei.estaciona.vaga;

public class Vaga 
{
	private static int count = 0;
	private int id_vaga;
	private boolean disponibilidade;
	private int tipo;
	
	public Vaga(int tipo)
	{
		Vaga.count++;
		this.id_vaga = Vaga.count;
		this.disponibilidade = true;
		this.tipo = tipo;
	}
	
	public int getId_vaga() 
	{
		return id_vaga;
	}
	
	public void setDisponibilidade(boolean disponibilidade) 
	{
		this.disponibilidade = disponibilidade;
	}
	
	public boolean verifica_disponibilidade()
	{
		return this.disponibilidade;
	}
	
	public int verifica_tipo()
	{
		return this.tipo;
	}
}
