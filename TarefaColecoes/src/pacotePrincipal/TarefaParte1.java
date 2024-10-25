package pacotePrincipal;
import java.util.Scanner;
public class TarefaParte1 {
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Insira a lista de nomes!(separados apenas por virgula)\n");
		String nomes = in.nextLine();
		String[] ListaNomes = nomes.split(",");
		System.out.println("A lista de nomes é:");
		for(String x : ListaNomes)
		{
			System.out.println(x);
		}
		in.close();
	}
}