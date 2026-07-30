package classes;
import java.util.ArrayList;
import java.util.List;
public class FilaFIFO {
	private List<Integer> lista = new ArrayList<>();
	
	public void enqueue(int a)
	{
		lista.add(a);
	}
	public void dequeue()
	{
		lista.remove(0);
	}
	public int rear()
	{
		return lista.getLast();
	}
	public int front()
	{
		return lista.getFirst();
	}
	public int size()
	{
		return lista.size();
	}
	public boolean isEmpty()
	{
		if(lista.isEmpty())
		{
			return true;
		}else
		{
			return false;
		}
	}
}
//Todos sao O(1) tanto em tempo quanto espaço (retornos e definições simples)