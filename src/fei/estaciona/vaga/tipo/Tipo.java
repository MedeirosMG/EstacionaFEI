package fei.estaciona.vaga.tipo;
import java.util.Map;
import java.util.HashMap;

public class Tipo 
{
	private Map<Integer, String> Tipos = new HashMap<Integer, String>();
	private int tipos_diferentes;
	
	public Tipo()
	{
		// Criando tipo de vagas padroes
		this.Tipos.put(1, "Aluno");
		this.Tipos.put(2, "Professor");
		this.Tipos.put(3, "Deficiente");
		this.tipos_diferentes = 3;
	}
	
	public void GetTiposDiferentes()
	{
		for (int i = 1 ; i <= this.tipos_diferentes ; ++i) 
		{
			if(this.Tipos.get(i) != null )
				System.out.println("Id '" + i + "' se refere a uma vaga para " + this.Tipos.get(i));
		}
	}
	
	public String VerificaTipo(int i)
	{
		return this.Tipos.get(i);
	}
	
	public void NovoTipo(int id, String tipo)
	{
		this.Tipos.put(id, tipo);
	}
	
	public void RemoveTipo(int id)
	{
		this.Tipos.remove(id);
	}
}
