package fei.estaciona.main;

import fei.estaciona.setor.SetorA;
import fei.estaciona.setor.SetorB;
import fei.estaciona.setor.SetorC;

public class Main {
	public static void main(String[] args)
	{	
		SetorA setor = new SetorA();
		SetorB setorB = new SetorB();
		SetorC setorC = new SetorC();
		
		setor.inserir_Nova_Vaga();
		setorB.inserir_Nova_Vaga();
		setorC.inserir_Nova_Vaga();
		
		int[] vagas = setor.vagas_Disponiveis();
		for (int i : vagas) {
			if(i != -1)
				System.out.println("Vaga com id: " + i);
		}
			
		/*
		Tipo tipo = new Tipo();
		
		tipo.GetTiposDiferentes();
		tipo.RemoveTipo(2);
		tipo.GetTiposDiferentes();
		
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
		*/
		
	}
}