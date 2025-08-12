package service;
import java.util.List;
import pacotePrincipal.Cliente;
public interface IClienteService {
	public void excluirCliente(int cpf);
	public Cliente buscarCliente(int cpf);
	public void atualizarCliente(int cpfABuscar,String nome, int cpf);
	public void salvarCliente(String nome,int cpf);
	public List<Cliente> mostrarTodos();
	public boolean jaExiste(int cpf);
}