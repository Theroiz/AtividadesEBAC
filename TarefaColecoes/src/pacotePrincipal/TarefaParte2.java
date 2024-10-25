package pacotePrincipal;
import java.util.Scanner;
import java.util.TreeMap;

public class TarefaParte2 {
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		String nomes = in.nextLine();
		String[] ListaNomesM = nomes.split(",");
		TreeMap<String,Boolean> ListaFeminina = new TreeMap<>();
		TreeMap<String,Boolean> ListaMasculina = new TreeMap<>();
		// Exemplos de nomes para copia e testar: anna-f,marcelo-m,paula-f,rodrigo-m,fernanda-f,roberto-m,claudia-f,joao-m / beatriz-f,ellen-f,carlos-m,mariana-f,gustavo-m,larissa-f,renato-m,ines-f,fabio-m
		for(String x : ListaNomesM)
		{
			System.out.println(x);
			if(x.contains("-f"))
			{
				ListaFeminina.put(x.replace("-f", ""), null);

			}else if(x.contains("-m"))
			{
				ListaMasculina.put(x.replace("-m", ""), null);
			}
		}
		System.out.println("\n--- Lista feminina ---");
		for(String x : ListaFeminina.keySet())
		{
			System.out.println(x);
		}
		
		System.out.println("\n--- Lista masculina ---");
		for(String x : ListaMasculina.keySet())
		{
			System.out.println(x);
		}
		in.close();
	}
}