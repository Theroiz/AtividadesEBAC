package heitor.enan.com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_acessorio")
public class Acessorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricaoKit;
    private boolean possuiTetoSolar;

    public Acessorio() {}

    public Acessorio(String descricaoKit, boolean possuiTetoSolar) {
        this.descricaoKit = descricaoKit;
        this.possuiTetoSolar = possuiTetoSolar;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDescricaoKit() { return descricaoKit; }
    public void setDescricaoKit(String descricaoKit) { this.descricaoKit = descricaoKit; }
    public boolean isPossuiTetoSolar() { return possuiTetoSolar; }
    public void setPossuiTetoSolar(boolean possuiTetoSolar) { this.possuiTetoSolar = possuiTetoSolar; }
}