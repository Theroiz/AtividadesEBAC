package pacotePrincipalTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import dao.ClienteDAO;
import pacotePrincipal.ClassePrincipalUI;
import pacotePrincipal.Cliente;
public class TesteGeral {
	Cliente cliente = new Cliente("joao",12345);
	public ClienteDAO dao = new ClienteDAO();
	public ClassePrincipalUI ui = new ClassePrincipalUI();
	@Test
	private void verificandoObjetoCliente()
	{
		//eu nao tinha uma ideia melhor de Test para fazer, sei q esta muito raso
		Cliente cliente = new Cliente("joao",12345);
		assertEquals("joao",cliente.getNome());
		assertEquals(12345,cliente.getCPF());
		assertEquals("sucesso",ui.atualizar());
		assertEquals("sucesso",ui.salvar());
		assertEquals("Sucesso",ui.buscar());
		assertEquals("sucesso",ui.mostrarTodos());
		assertEquals("sucesso",ui.excluir());
	}
}