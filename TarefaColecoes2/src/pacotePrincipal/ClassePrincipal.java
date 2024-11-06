package pacotePrincipal;
import java.util.Scanner;
import java.util.ArrayList;
public class ClassePrincipal 
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		String[] pessoasArray;
		ArrayList<String> Masculinos = new ArrayList<>();
		ArrayList<String> Femininos = new ArrayList<>();
		ArrayList<String> SemGenero = new ArrayList<>();
		System.out.println("Adicione nomes e generos de pessoas nesse estilo (nome-genero)");
		String pessoas = in.nextLine();
		System.out.println(pessoas);
		pessoasArray = pessoas.split(",");
		//Nomes para teste: marcelo-m,anna,paula-f,joao,juliana-f,rodrigo-m,carla-f
		for(String nome : pessoasArray)
		{
			if(nome.contains("-m"))
			{
				Masculinos.add(nome.replace("-m", " "));
			}else if(nome.contains("-f"))
			{
				Femininos.add(nome.replace("-f", " "));
			}else
			{
				SemGenero.add(nome);
			}
		}
		System.out.println("Nomes femininos: "+Femininos.size());
		for(String x : Femininos)
		{
			System.out.println(x);
		}
		System.out.println("\n\nNomes masculinos: "+Masculinos.size());
		for(String x : Masculinos)
		{
			System.out.println(x);
		}
		if(SemGenero.size() > 0)
		{
			System.out.println("\n\nNomes sem genero: "+SemGenero.size());
			for(String x : SemGenero)
			{
				System.out.println(x);
			}
		}
	}
}
