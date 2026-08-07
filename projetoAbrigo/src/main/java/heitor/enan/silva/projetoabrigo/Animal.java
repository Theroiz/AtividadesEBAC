package heitor.enan.silva.projetoabrigo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String especie;

    private String nomeProvisorio;
    private Integer idadeEstimada;
    private String raca;
    private LocalDate dataEntrada;
    private LocalDate dataAdocao;
    private String condicoesChegada;
    private String nomeRecebedor;
    private LocalDate dataObito;
    private String porte; 

    public Animal() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNomeProvisorio() { return nomeProvisorio; }
    public void setNomeProvisorio(String nomeProvisorio) { this.nomeProvisorio = nomeProvisorio; }

    public Integer getIdadeEstimada() { return idadeEstimada; }
    public void setIdadeEstimada(Integer idadeEstimada) { this.idadeEstimada = idadeEstimada; }

    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }

    public LocalDate getDataEntrada() { return dataEntrada; }
    public void setDataEntrada(LocalDate dataEntrada) { this.dataEntrada = dataEntrada; }

    public LocalDate getDataAdocao() { return dataAdocao; }
    public void setDataAdocao(LocalDate dataAdocao) { this.dataAdocao = dataAdocao; }

    public String getCondicoesChegada() { return condicoesChegada; }
    public void setCondicoesChegada(String condicoesChegada) { this.condicoesChegada = condicoesChegada; }

    public String getNomeRecebedor() { return nomeRecebedor; }
    public void setNomeRecebedor(String nomeRecebedor) { this.nomeRecebedor = nomeRecebedor; }

    public LocalDate getDataObito() { return dataObito; }
    public void setDataObito(LocalDate dataObito) { this.dataObito = dataObito; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }
    public String getPorte() { return porte; }
    public void setPorte(String porte) { this.porte = porte; }
}