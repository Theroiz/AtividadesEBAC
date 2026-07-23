package heitor.enan.com.service;

import heitor.enan.com.domain.Cliente;
import heitor.enan.com.repository.ClienteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.io.Serializable;
import java.util.List;

@ApplicationScoped
public class ClienteService implements Serializable {

    @Inject
    private ClienteRepository repository;

    public void salvarCliente(Cliente cliente) throws Exception {
        if (cliente.getNome() == null || cliente.getNome().trim().isEmpty()) {
            throw new Exception("O nome do cliente é obrigatório!");
        }
        if (cliente.getCpf() == null || cliente.getCpf().trim().isEmpty()) {
            throw new Exception("O CPF do cliente é obrigatório!");
        }
        
        cliente.setNome(cliente.getNome().toUpperCase());

        repository.salvar(cliente);
    }

    public List<Cliente> listarTodos() {
        return repository.buscarTodos();
    }
}