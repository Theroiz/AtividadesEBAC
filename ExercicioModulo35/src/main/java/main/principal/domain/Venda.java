package main.principal.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "TB_VENDA")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "codigo", unique = true, nullable = false)
    private String codigo;
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;
    @Column(name = "valor_total", nullable = false, precision = 10, scale = 2)
    private BigDecimal valorTotal;
    @Column(name = "data_venda", nullable = false)
    private Instant dataVenda;
    @Enumerated(EnumType.STRING)
    @Column(name = "status_venda", nullable = false)
    private Status status;

    public enum Status {
        INICIADA, CONCLUIDA, CANCELADA
    }
    public Venda() {}
    // Getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public BigDecimal getValorTotal() { return valorTotal; }
    public void setValorTotal(BigDecimal valorTotal) { this.valorTotal = valorTotal; }
    public Instant getDataVenda() { return dataVenda; }
    public void setDataVenda(Instant dataVenda) { this.dataVenda = dataVenda; }
    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }
}