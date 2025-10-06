package Interfaces;
import java.util.ArrayList;
import Main.Cliente;
public interface iClienteDao {
	public Cliente salvar(Cliente cliente);
	public Cliente alterar(Long idAlvo, String novoNome, int novoCpf);
	public void excluir(Long id);
	public ArrayList<Cliente> mostrarTodos();
	public Cliente buscar(Long cpf);
}