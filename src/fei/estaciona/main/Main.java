package fei.estaciona.main;
import fei.estaciona.setor.*;

public class Main {
	public static void main(String[] args) 
	{
		SetorA novosetor = new SetorA();
		int num = novosetor.vagasDisponiveis();
		System.out.println("ola " + num);
	}
}
