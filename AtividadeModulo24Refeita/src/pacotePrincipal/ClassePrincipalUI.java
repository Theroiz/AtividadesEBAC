package pacotePrincipal;
import java.util.Scanner;
import service.ClienteService;
public class ClassePrincipalUI {
	private static ClienteService service = new ClienteService();
	private static boolean sair = false;
	private static boolean sair2 = false;
	private static int opcao;
	static Scanner in = new Scanner(System.in);
	public static void main(String[]args)
	{
		while(!sair2)
		{
			System.out.println("              ----- Menu -----\nSelecione a opção desejada (ex: 1,2,3,4,5,6):\n1 - salvar\n2 - apagar\n3 - buscar\n4 - atualizar\n5 - mostrar todos\n6 - sair");
			opcao = Integer.parseInt(in.nextLine());
			if(opcao == 6)
			{
				sair2 = true;
				System.out.println("Saindo");
			}
			else if(opcao == 1)
			{
				salvar();
			}else if(opcao == 2)
			{
				excluir();
			}else if(opcao == 3)
			{
				buscar();
			}else if(opcao == 4)
			{
				atualizar();
			}else if(opcao == 5)
			{
				mostrarTodos();
			}else
			{
				System.out.println("Nenhuma opcao valida selecionada");
				opcao = 0;
			}
		}

		in.close();
	}
	
	//metodos
	
	public static String salvar()
	{
		sair = false;
		while(sair == false)
		{
			System.out.println("Insira o nome do cliente");
			String nome = in.nextLine();
			System.out.println("Insira o cpf do cliente");
			int cpf = Integer.parseInt(in.nextLine());
			service.salvarCliente(nome, cpf);
			System.out.println("Gostaria de salvar mais clientes?\n1 - sim\n2 - nao");
			opcao = Integer.parseInt(in.nextLine());
			if(opcao == 1)
			{
				opcao = 0;
			}else if(opcao == 2)
			{
				sair = true;
				opcao = 0;
			}
		}
		return "sucesso";
	}
	public static String excluir()
	{
		System.out.println("Insira o cpf do cliente a ser apagado (a acao nao pode ser desfeita)");
		service.excluirCliente(Integer.parseInt(in.nextLine()));
		opcao = 0;
		return "sucesso";
	}
	public static String buscar()
	{
		System.out.println("Insira o cpf do cliente que deseja encontrar");
		System.out.println(service.buscarCliente(Integer.parseInt(in.nextLine())));
		opcao = 0;
		return "sucesso";
	}
	public static String atualizar()
	{
		System.out.println("Insira o cliente que gostaria de alterar os dados e seus novos dados (nome, cpf)");
		int cpfAlvo = Integer.parseInt(in.nextLine());
		System.out.println("Insira o novo nome do cliente");
		String novoNome = in.nextLine();
		System.out.println("Insira o novo cpf do cleinte");
		int novoCpf = Integer.parseInt(in.nextLine());
		service.atualizarCliente(cpfAlvo, novoNome, novoCpf);
		opcao = 0;
		return "sucesso";
	}
	public static String mostrarTodos()
	{
		System.out.println("Todos os clientes cadastrados no banco de dados: "+service.mostrarTodos());
		opcao = 0;
		return "Sucesso";
	}
}