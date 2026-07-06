package main.principal.services;

import main.principal.domain.Cliente;
import java.util.List;

public interface IClienteService {
    Cliente cadastrar(Cliente cliente);
    Cliente alterar(Cliente cliente);
    Cliente consultar(Long id);
    void excluir(Cliente cliente);
    List<Cliente> buscarTodos();
}