package pacotePrincipal;
import java.util.Scanner;
public class ClassePrincipal {
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Insira um valor!");
		int num = in.nextInt();
		Integer numCast = (Integer) num;
		System.out.println("O seu valor como um wrapper fica: "+numCast);// no lugar de criar uma nova variavel para fazer o casting eu poderia apenas fazer o casting direto no print? exemplo:(System.out.println("O seu valor como um wrapper fica: "+(Integer)num);
		in.close();
	}
}
