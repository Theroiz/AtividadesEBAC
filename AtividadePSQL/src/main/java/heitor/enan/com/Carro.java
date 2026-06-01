package heitor.enan.com;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_carro")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "marca_id", referencedColumnName = "id", unique = true)
    private Marca marca;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "acessorio_id", referencedColumnName = "id", unique = true)
    private Acessorio acessorio;

    public Carro() {}

    public Carro(String modelo, Marca marca, Acessorio acessorio) {
        this.modelo = modelo;
        this.marca = marca;
        this.acessorio = acessorio;
    }

    //getters
    
	public Long getId() {
		return id;
	}
	public String getModelo() {
		return modelo;
	}
	public Marca getMarca() {
		return marca;
	}
	public Acessorio getAcessorio() {
		return acessorio;
	}
	
	//setters

	public void setId(Long id) {
		this.id = id;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	

	public void setAcessorio(Acessorio acessorio) {
		this.acessorio = acessorio;
	}
}
