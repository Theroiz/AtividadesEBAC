package pacotePrincipal;

public class PessoaFisica extends Pessoa {
	private int cpf;
	public PessoaFisica(String nome, int cpf)
	{
		super(nome);
		this.cpf = cpf;
	}
	public int getCPF()
	{
		return this.cpf;
	}
	public void imprimirDados()
	{
		System.out.println("CPF: "+this.cpf);
		System.out.println("Nome: "+getNome()+"\n");
	}
}