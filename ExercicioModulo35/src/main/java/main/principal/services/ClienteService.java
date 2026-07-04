package main.principal.services;

import main.principal.dao.IClienteDAO;
import main.principal.domain.Cliente;
import java.util.List;

public class ClienteService implements IClienteService 
{

    private IClienteDAO clienteDAO;
    public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }
    @Override
    public Cliente cadastrar(Cliente cliente) {
        return clienteDAO.cadastrar(cliente);
    }
    @Override
    public Cliente alterar(Cliente cliente) {
        return clienteDAO.alterar(cliente);
    }
    @Override
    public Cliente consultar(Long id) {
        return clienteDAO.consultar(id);
    }
    @Override
    public void excluir(Cliente cliente) {
        clienteDAO.excluir(cliente);
    }
    @Override
    public List<Cliente> buscarTodos() {
        return clienteDAO.buscarTodos();
    }
}