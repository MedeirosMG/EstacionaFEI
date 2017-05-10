package fei.estaciona.vaga;

public class Vaga
{
	private boolean disponibilidade;
	private int tipo;
	private static VagasBD bd = new VagasBD();
	
	public Vaga(int tipo_vaga)
	{
		this.disponibilidade = true;
		this.tipo = tipo_vaga;
	}
	
	public void setDisponibilidade(boolean disponibilidade) 
	{
		this.disponibilidade = disponibilidade;
	}
	
	public boolean verifica_disponibilidade()
	{
		return this.disponibilidade;
	}
	
	public String GetTipo()
	{
		return bd.VerificaTipoVaga(tipo);
	}
}