package DAOS;
import Interfaces.iClienteDao;
import Main.Cliente;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;

public class ClienteDao implements iClienteDao{
	private Connection conexao;
	public ClienteDao()
	{
		this.conexao = ConexaoDB.getConnection();
	}
	public Cliente salvar(Cliente cliente)
	{
		String sql = "insert into clientes (nome,cpf) values (?,?)";
		try(PreparedStatement stmt = this.conexao.prepareStatement(sql))
		{
			stmt.setString(1, cliente.getNome());
			stmt.setInt(2, cliente.getCpf());
			
			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			if(rs.next())
			{
				cliente.setId(rs.getLong(1));
			}
		}catch (SQLException e)
		{
			throw new RuntimeException("Erro ao salvar cliente: " + e.getMessage(), e);
		}
		return cliente;
	}
	public Cliente buscar(Long cpf)
	{
		String sql = "select * from clientes where cpf = ?";
		Cliente clienteEncontrado = null;
		try(PreparedStatement stmt = this.conexao.prepareStatement(sql))
		{
			stmt.setLong(1, cpf);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next())
			{
				clienteEncontrado = new Cliente();
				clienteEncontrado.setId(rs.getLong("id"));
				clienteEncontrado.setNome(rs.getString("nome"));
				clienteEncontrado.setCpf(rs.getInt("cpf"));
			}
		} catch(SQLException e)
		{
			throw new RuntimeException("Erro ao buscar cliente por CPF: " + e.getMessage(), e);
		}
		return clienteEncontrado;
	}
	public Cliente alterar(Long idAlvo,String novoNome, int novoCpf)
	{
		String sql = "update clientes set nome = ?, cpf = ? where id = ?";
		Cliente cliente = new Cliente();
		try(PreparedStatement stmt = this.conexao.prepareStatement(sql))
		{
			stmt.setString(1, novoNome);
			stmt.setInt(2, novoCpf);
			stmt.setLong(3, idAlvo);
			stmt.executeUpdate();
			cliente.setNome(novoNome);
			cliente.setCpf(novoCpf);
			cliente.setId(idAlvo);
			
		} catch(SQLException e)
		{
			throw new RuntimeException("Erro ao atualizar o cliente: " + e.getMessage(), e);
		}
		return cliente;
	}
	public void excluir(Long id)
	{
		String sql = "delete from clientes where id = ?";
		
		try(PreparedStatement stmt = this.conexao.prepareStatement(sql))
		{
			stmt.setLong(1, id);
			
			stmt.executeUpdate();
		} catch (SQLException e)
		{
			throw new RuntimeException("Erro ao excluir cliente: " + e.getMessage(), e);
		}
	}
	public ArrayList<Cliente> mostrarTodos()
	{
		ArrayList<Cliente> clientes = new ArrayList<>();
		String sql = "select * from clientes";
		
		try(PreparedStatement stmt = this.conexao.prepareStatement(sql))
		{
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Cliente cliente = new Cliente();
				cliente.setId(rs.getLong("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCpf(rs.getInt("cpf"));
				
				clientes.add(cliente);
			}
		} catch (SQLException e)
		{
			throw new RuntimeException("Erro ao buscar todos os clientes: " + e.getMessage(), e);
		}
		return clientes;
	}
}