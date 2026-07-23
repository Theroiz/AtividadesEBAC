package heitor.enan.com.controller;

import heitor.enan.com.domain.Cliente;
import heitor.enan.com.service.ClienteService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class ClienteController implements Serializable {

    @Inject
    private ClienteService service;

    private Cliente cliente;
    private List<Cliente> listaClientes;

    @PostConstruct
    public void init() {
        cliente = new Cliente();
        atualizarLista();
    }

    public void salvar() {
        try {
            service.salvarCliente(cliente);
            FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Cliente salvo com sucesso!"));
            
            cliente = new Cliente();
            atualizarLista();
            
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", e.getMessage()));
        }
    }

    private void atualizarLista() {
        listaClientes = service.listarTodos();
    }

    // Getters e Setters
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public List<Cliente> getListaClientes() { return listaClientes; }
}