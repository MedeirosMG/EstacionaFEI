package fei.estaciona.setor;

public interface Setor 
{	
	public int vagasDisponiveis();


	public void alterar_Disponibilidade_Setor(boolean disponivel);
	public boolean Verifica_Disponibilidade_Setor();
	public void alterar_Disponibilidade_Vaga(boolean disponivel);
}
