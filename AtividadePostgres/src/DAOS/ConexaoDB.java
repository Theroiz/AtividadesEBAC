package DAOS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConexaoDB {
	private static final String URL = "jdbc:postgresql://localhost:porta/bancoDeDados";
	private static final String USER = "usuario";
	private static final String PASSWORD = "senha";
	
	
	
	public static Connection getConnection()
	{
		try
		{
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e)
		{
			System.err.println("Falha ao estabelecer conexao com o banco de dados.");
			throw new RuntimeException("Erro de conexao com o DB: " + e.getMessage(), e);
		}
	}
}