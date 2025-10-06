package Main;

public class Cliente {
	private String nome;
	private int cpf;
	private Long id;
	
	//setters
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public void setCpf(int cpf)
	{
		this.cpf = cpf;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	
	//getters
	
	public String getNome()
	{
		return this.nome;
	}
	public int getCpf()
	{
		return this.cpf;
	}
	public Long getId()
	{
		return this.id;
	}
	
	@Override
	public String toString()
	{
		return "nome: " + this.nome + " cpf: " + this.cpf + " id: " + this.id;
	}
}