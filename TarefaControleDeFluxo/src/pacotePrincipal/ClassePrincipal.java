package pacotePrincipal;
import java.util.Scanner;
public class ClassePrincipal {
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		int valor1,valor2,valor3,valor4;
		System.out.println("Insira o valor da primeira nota! ");
		valor1 = in.nextInt();
		System.out.println("Insira o valor da segunda nota! ");
		valor2 = in.nextInt();
		System.out.println("Insira o valor da terceira nota! ");
		valor3 = in.nextInt();
		System.out.println("Insira o valor da terceira nota! ");
		valor4 = in.nextInt();
		if((valor1+valor2+valor3+valor4)/4 >= 7)
		{
			System.out.println("Você passou!");
		} else if((valor1+valor2+valor3+valor4)/4 >= 5)
		{
			System.out.println("Você ficou de recuperação!");
		}else
		{
			System.out.println("Você foi reprovado!");
		}
		in.close();
	}
}
