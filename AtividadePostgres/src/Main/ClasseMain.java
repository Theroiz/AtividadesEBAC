package Main;
import DAOS.ClienteDao;
import Main.Cliente;

import java.util.ArrayList;
public class ClasseMain 
{
	public static void main(String[]args)
	{	
		Cliente cliente = new Cliente();
		ClienteDao dao = new ClienteDao();
		cliente.setNome("testando");
		cliente.setCpf(1234567);
		System.out.println("setando cliente" + cliente);
		dao.salvar(cliente);
		System.out.println("salvando o cliente");
		mostrarTds(dao);
		System.out.println("alterando dados do cliente");
		dao.alterar(cliente.getId(),"nomeTeste", 7654321);
		mostrarTds(dao);
		System.out.println("deletando o cliente");
		Long idADeletar = cliente.getId();
		dao.excluir(idADeletar);
		mostrarTds(dao);
	}
	public static void mostrarTds(ClienteDao dao)
	{
		ArrayList<Cliente> listaClientes = dao.mostrarTodos();
		System.out.println("Numero de clientes total" + listaClientes.size());
		for(Cliente c : listaClientes)
		{
			System.out.println(c);
		}
	}
}