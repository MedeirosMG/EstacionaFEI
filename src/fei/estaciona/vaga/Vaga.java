package fei.estaciona.vaga;
import fei.estaciona.vaga.tipo.*;

public class Vaga
{
	private boolean disponibilidade;
	private int tipo;
	private Tipo tabela_tipo;
	
	public Vaga(int tipo)
	{
		this.disponibilidade = true;
		this.tipo = tipo;
	}
	
	public void setDisponibilidade(boolean disponibilidade) 
	{
		this.disponibilidade = disponibilidade;
	}
	
	public boolean verifica_disponibilidade()
	{
		return this.disponibilidade;
	}
	
	public String verifica_tipo()
	{
		return this.tabela_tipo.VerificaTipo(this.tipo);
	}
}
