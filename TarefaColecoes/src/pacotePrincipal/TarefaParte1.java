package pacotePrincipal;
import java.util.Scanner;
import java.util.TreeMap;
public class TarefaParte1 {
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Insira a lista de nomes!(separados apenas por virgula)\n");
		//exemplos de nomes para teste joao,marcelo,anna,rodrigo,gustavo,pablo,carolina
		String nomes = in.nextLine();
		String[] ListaNomes = nomes.split(",");
		TreeMap<String,Boolean> NomesOrdem = new TreeMap<>();
		System.out.println("A lista de nomes é:");
		for(String x : ListaNomes)
		{
			NomesOrdem.put(x, null);
		}
		for(String y : NomesOrdem.keySet())
		{
			System.out.println(y);
		}
		in.close();
	}
}