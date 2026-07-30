package classes;
import java.util.ArrayList;
import java.util.List;
public class Pilha {
	private List<Integer> lista = new ArrayList<>();
	
	public void push(int a)
	{
		lista.add(a);
	}
	public int pop()
	{
		int ultimo = lista.getLast();
		lista.removeLast();
		return ultimo;
	}
	public int top()
	{
		return lista.getLast();
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
	public int size()
	{
		return lista.size();
	}
}//Todos os metodos sao O(1), em espaço e tempo (definições e retorno de valor simples)