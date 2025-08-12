package pacotePrincipal;

public class Cliente {
	private int cpf;
	private String nome;
	public Cliente(String nome,int cpf){this.nome = nome;this.cpf = cpf;}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public void setCPF(int cpf)
	{
		this.cpf = cpf;
	}
	public String getNome()
	{
		return this.nome;
	}
	public int getCPF()
	{
		return this.cpf;
	}
	@Override
	public String toString()
	{
		return "Nome: "+this.nome+"\nCPF: "+this.cpf;
	}
}