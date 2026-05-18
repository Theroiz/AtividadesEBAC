package heitor.enan.com;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
public class Produto {
	public Produto(){}
	@Id
	@Column(name = "id_produto")
	private Integer id;
	@Column(name = "nome_produto")
	private String nome;
	@Column(name = "quantidade")
	private Integer qntd;
	@Column(name = "preco")
	private Double preco;
	@Column(name = "marca_produto")
	private String marca;

	//Getters

	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}

	public Integer getQntd() {
		return qntd;
	}
	public Double getPreco() {
		return preco;
	}
	public String getMarca() {
		return marca;
	}

	//Setters

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setQntd(Integer qntd) {
		this.qntd = qntd;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString()
	{
		return "Nome: "+this.nome+"\nQuantidade: "+this.qntd+"\nPreço: "+this.preco+"\nMarca: "+this.marca;
	}
}