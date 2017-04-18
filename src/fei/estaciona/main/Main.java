package fei.estaciona.main;

import fei.estaciona.setor.SetorA;

public class Main {
	public static void main(String[] args)
	{		
		SetorA setor = new SetorA();
		
		setor.alterar_Disponibilidade_Setor(true);
		setor.inserir_Nova_Vaga();
		setor.inserir_Nova_Vaga();
		setor.inserir_Nova_Vaga();
		setor.inserir_Nova_Vaga();
		setor.inserir_Nova_Vaga();
		setor.inserir_Nova_Vaga();
		
		setor.alterar_Disponibilidade_Setor(false);
		
		setor.inserir_Nova_Vaga();
		setor.inserir_Nova_Vaga();
		setor.inserir_Nova_Vaga();
		setor.inserir_Nova_Vaga();
		setor.inserir_Nova_Vaga();
		setor.inserir_Nova_Vaga();
		
		int[] vetor = setor.vagas_Disponiveis();
		
		for (int i : vetor) {
			if(i !=0)
				System.out.println(i);
			else
				break;
		}
	}
}