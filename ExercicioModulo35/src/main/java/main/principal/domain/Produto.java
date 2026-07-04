package main.principal.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "codigo", unique = true, nullable = false, length = 10)
    private String codigo;
    @Column(name = "nome", nullable = false, length = 100)
    private String nome;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "valor", nullable = false, precision = 10, scale = 2)
    private BigDecimal valor;

    public Produto() {}
    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public BigDecimal getValor() { return valor; }
    public void setValor(BigDecimal valor) { this.valor = valor; }
}