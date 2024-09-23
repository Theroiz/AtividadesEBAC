package exercicioClasses;
import java.util.Scanner;

public class ClassePrincipal {

	public static void main(String[]args)
	{
		//instanciamento da classe DadosCliente como dados
		DadosCliente dados = new DadosCliente();
		//instanciamento do scanner como in
		Scanner in = new Scanner(System.in);
		System.out.println("Olá, cadastre seus dados para criar uma conta!\nNome de usuario: ");
		//o metodo setNome da classe dados recebe uma string do scanner e associa esse valor a variavel nome
		dados.setNome(in.nextLine());
		System.out.println("Idade do usuario: ");
		//o metodo setIdade da classe dados recebe um int(valor inteiro) do scanner e associa esse valor a variavel idade
		dados.setIdade(in.nextInt());
		//imprime o valor da variavel nome e idade utilizando os metodos getNome e getIdade
		System.out.println("Seus dados foram cadastrados como:\nNome do usuario: "+dados.getNome()+"\nIdade do usuario: "+dados.getIdade());
		//fechamento do scanner
		in.close();
	}
}