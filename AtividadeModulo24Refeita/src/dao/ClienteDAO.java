package dao;
//classes
import pacotePrincipal.Cliente;
//funções
import java.util.List;
import java.util.ArrayList;

public class ClienteDAO implements IClienteDAO {
	private List<Cliente> clientes = new ArrayList<>();
	@Override
	public void salvar(Cliente x)
	{
		clientes.add(x);
	}
	@Override
	public void excluir(int cpf)
	{
		clientes.removeIf(item -> item.getCPF() == cpf);
	}
	@Override
	public void atualizar(Cliente x, String nome,int cpf)
	{
		x.setCPF(cpf);
		x.setNome(nome);
	}
	public Cliente buscar(int cpf)
	{
		for(Cliente item : clientes)
		{
			if(item.getCPF() == cpf)
			{
				return item;
			}
		}
		return null;
	}
	@Override
	public List<Cliente> mostrarTodos()
	{
		return clientes;
	}
	
}