package fei.estaciona.simula;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import fei.estaciona.Log.GeraLog;
import fei.estaciona.interfaceGrafica.Setor.GraficoSetor;
import fei.estaciona.setor.SetorFull;

public class Simulacao implements Runnable{
	
	SetorFull BDsetor;
	GraficoSetor setor;
	GeraLog log = new GeraLog();
	Random gerador = new Random();
	
	public Simulacao(SetorFull BDsetor, GraficoSetor setor)
	{
		this.BDsetor = BDsetor;
		this.setor = setor;
	}
	
	public void run() {
		
		while(true)
		{
			int [] ids = BDsetor.idsVagas();
			
			int randomNum = gerador.nextInt(16);

			if(ids[randomNum] != -1)
			{
				
				if(BDsetor.verifica_disponibilidade_vaga(ids[randomNum]))
					BDsetor.alterar_Disponibilidade_Vaga(false, ids[randomNum]);
				else
					BDsetor.alterar_Disponibilidade_Vaga(true, ids[randomNum]);
				
				setor.preencheVagas();
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					log.escreveLog(e.getMessage());
				}
			}
			
		}
		
		
	
	}

}
