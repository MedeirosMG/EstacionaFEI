package fei.estaciona.setor;

import java.util.Scanner;

import fei.estaciona.vaga.VagasBD;
import fei.estaciona.vaga.tipo.Tipo;

public interface Setor 
{	
	static VagasBD banco_de_vagas = new VagasBD();
	static Tipo tipos = new Tipo();
	static int MAX = 16;
	static Scanner leitor = new Scanner(System.in);
	
	public int inserir_Nova_Vaga(int tipoVaga);
	public int[] vagas_Disponiveis();  // Verifica quais as vagas disponiveis do setor
	public void alterar_Disponibilidade_Vaga(boolean disponivel, int id); // Altera a disponibilidade da vaga X
	void alterar_Disponibilidade_Setor(boolean disponivel);
	boolean Verifica_Disponibilidade_Setor();
	boolean verifica_disponibilidade_vaga(int id);
	String[] tipoVagas();
	int[] idsVagas();
}