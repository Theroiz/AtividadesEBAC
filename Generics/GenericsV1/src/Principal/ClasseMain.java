package Principal;
import java.util.List;
import java.util.ArrayList;
public class ClasseMain {
    public static void main(String[]args)
    {
        Sedan sedan = new Sedan("Toyota","azul",2023);
        Conversivel conversivel = new Conversivel("toyota","verde",2021);
        Suv SUV = new Suv("Chevrolet","amarelo",2025);
        
        List<iCarros> carros = new ArrayList<>();
        carros.add(sedan);
        conversivel.acelerar();
        carros.add(conversivel);
        carros.add(SUV);
        for(Object item : carros)
        {
            System.out.println(item+"\n");
        }
    }
}