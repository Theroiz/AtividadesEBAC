package exercicioClasses;

public class DadosCliente {
	//variaveis idade e nome definidas como publicas
	public int idade;
	public String nome;
	
	//----metodos getters----
	//metodo que retorna o valor de idade
	public int getIdade()
	{
		return idade;
	}
	//metodo que retorna valor de nome
	public String getNome()
	{
		return nome;
	}
	
	//----metodos setters----
	//define o valor de idade baseado no parametro do metodo
	public void setIdade(int idade)
	{
		this.idade = idade;
	}
	//define o valor de idade baseado no parametro do metodo
	public void setNome(String nome)
	{
		this.nome = nome;
	}
}
