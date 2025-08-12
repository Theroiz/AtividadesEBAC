package dao;
import pacotePrincipal.Cliente;
import java.util.List;
public interface IClienteDAO {
	void salvar(Cliente x);
	Cliente buscar(int cpf);
	void excluir(int cpf);
	void atualizar(Cliente x,String nome,int cpf);
	List<Cliente> mostrarTodos();
}