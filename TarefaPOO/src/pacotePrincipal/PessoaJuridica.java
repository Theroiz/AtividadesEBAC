package pacotePrincipal;

public class PessoaJuridica extends Pessoa {
	private int cnpj;
	public PessoaJuridica(String nome,int cnpj)
	{
		super(nome);
		this.cnpj = cnpj;
	}
	public void imprimirDados()
	{
		System.out.println("CNPJ: "+this.cnpj);
		System.out.println("Nome: "+getNome()+"\n");
	}
}
