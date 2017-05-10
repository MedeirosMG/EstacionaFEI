package fei.estaciona.setor;

public interface Setor 
{	
	static int MAX = 16;
	
	public int[] vagas_Disponiveis();  // Verifica quais as vagas disponiveis do setor
	public void alterar_Disponibilidade_Vaga(boolean disponivel, int id); // Altera a disponibilidade da vaga X
	void alterar_Disponibilidade_Setor(boolean disponivel);
	boolean Verifica_Disponibilidade_Setor();
	boolean verifica_disponibilidade_vaga(int id);
	String[] tipoVagas();
	int[] idsVagas();
	boolean inserir_Nova_Vaga(int tipoVaga, int id, int numSetor);
	boolean deletar_vaga(int id, int numSetor);
}