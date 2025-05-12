package PacotePrincipal;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class ClassePrincipal {
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira uma sequencia de nomes e generos segundo o exemplo a seguir (nome - genero,nome-genero,nome-genero)");
        String nomes = in.nextLine();in.close();
        String[] listaInteira = nomes.split(",");
        List<String> lista = new ArrayList<>();
        for(String item : listaInteira)
        {
            lista.add(item);
        }
        List<String> lista2 = lista.stream().filter(item -> item.contains("feminino")).map(item -> item.replace("-feminino", "")).toList();
        System.out.println(lista2.size()+" nomes femininos: ");
        lista2.forEach(item -> System.out.println(item));
    }
}
