package fei.estaciona.setor;

public interface Setor 
{	
	static int MAX = 100;
	static int id_geral = 0;
	public void inserir_Nova_Vaga();
	public int[] vagas_Disponiveis();  // Verifica quais as vagas disponiveis do setor
	public void alterar_Disponibilidade_Setor(boolean disponivel); // Altera disponibilidade do setor ( Aberto ou fechado )
	public boolean Verifica_Disponibilidade_Setor();  // Verifica a disponibilidade do setor ( Se esta aberto ou fechado )
	public void alterar_Disponibilidade_Vaga(boolean disponivel, int id); // Altera a disponibilidade da vaga X
}