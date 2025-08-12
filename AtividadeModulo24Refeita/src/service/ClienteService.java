package service;
import dao.ClienteDAO;
import pacotePrincipal.Cliente;
import java.util.List;
public class ClienteService implements IClienteService{
	private ClienteDAO dao = new ClienteDAO();
	@Override
	public void excluirCliente(int cpf)
	{
		dao.excluir(cpf);
	}
	@Override
	public Cliente buscarCliente(int cpf)
	{
		//checando se o cpf existe na lista
		for(Cliente item : dao.mostrarTodos())
		{
			if(item.getCPF() == cpf)
			{
				return item;
			}
		}
		return null;
	}
	@Override
	public void atualizarCliente(int cpfABuscar,String nome,int cpf)
	{
		if(!nome.isBlank() || cpf == 0)
		{
			for(Cliente item : dao.mostrarTodos())
			{
				if(item.getCPF() == cpfABuscar)
				{
					item.setNome(nome);
					item.setCPF(cpf);
				}
			}
		}else
		{
			System.out.println("Os dados nao sao validos!");
		}
	}
	@Override
	public void salvarCliente(String nome,int cpf)
	{
		if(nome.isBlank() || cpf == 0 || jaExiste(cpf))
		{
			System.out.println("Dados invalidos ou cliente ja existente");
		}else
		{
			Cliente x = new Cliente(nome,cpf);
			dao.salvar(x);
		}
	}
	@Override
	public List<Cliente> mostrarTodos()
	{
		for(Cliente item : dao.mostrarTodos())
		{
			if(item.getNome().isBlank() || item.getCPF() == 0)
			{
				return null;
			}
		}
		return dao.mostrarTodos();
	}
	@Override
	public boolean jaExiste(int cpf)
	{
		for(Cliente item : dao.mostrarTodos())
		{
			if(item.getCPF() == cpf)
			{
				return true;
			}
		}
		return false;
	}
}