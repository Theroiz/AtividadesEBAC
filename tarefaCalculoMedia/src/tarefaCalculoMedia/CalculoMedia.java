package tarefaCalculoMedia;

public class CalculoMedia {
	public int Calculo(int val1,int val2, int val3,int val4)
	{
		ValoresUsuario valores = new ValoresUsuario(); //alterei o modo que o metodo recebia os valores pois nao estava funcionando,antes ele acessava os valores direto dos getters da classe "valoresUsuario"
		int Total = (val1+val2+val3+val4)/4;
		return Total;
	}
}
