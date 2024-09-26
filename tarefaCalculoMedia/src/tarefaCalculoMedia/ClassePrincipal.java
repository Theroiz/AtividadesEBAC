package tarefaCalculoMedia;
import java.util.Scanner;
public class ClassePrincipal {
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		ValoresUsuario valores = new ValoresUsuario();
		CalculoMedia media = new CalculoMedia();
		System.out.println("Olá!\nInsira as notas dos alunos: ");
		valores.setNota1(input.nextInt());
		System.out.println("Insira a nota do segundo aluno: ");
		valores.setNota2(input.nextInt());
		System.out.println("Insira a nota do terceiro aluno: ");
		valores.setNota3(input.nextInt());
		System.out.println("Insira a nota do quarto aluno: ");
		valores.setNota4(input.nextInt());
		System.out.println("As notas sao: "+valores.getNota1()+","+valores.getNota2()+","+valores.getNota3()+","+valores.getNota4()+"\nA media é: "+media.Calculo(valores.getNota1(),valores.getNota2(),valores.getNota3(),valores.getNota4()));
		input.close();
	}
}
