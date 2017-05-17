package fei.estaciona.Log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class GeraLog {
	
	private FileWriter arq;
    private PrintWriter gravarArq;
    private LocalDateTime now = LocalDateTime.now();
    
    public void escreveLog(String log)
    {
    	try {
 			this.arq = new FileWriter("Log.txt", true);
 			this.gravarArq  = new PrintWriter(arq);
 			
 			String newlog = now.toLocalDate() + " | " + now.toLocalTime() + " | " + log;
 			gravarArq.println(newlog);
 	    	
 	    	arq.close();
 		}catch (IOException e) {
 			e.printStackTrace();
 		}
    }
}
