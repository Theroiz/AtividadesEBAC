package Principal;
import java.util.List;
import java.util.ArrayList;
public class ClasseMain {
    public static void main(String[]args)
    {
        List<iCarros> Chevrolet = new ArrayList<>();
        List<iCarros> Toyota = new ArrayList<>();
        Chevrolet.add(new Sedan("verde",2019));
        Chevrolet.add(new Suv("rosa",2023));
        Chevrolet.add(new Conversivel("amarelo",2025));
        
        Toyota.add(new Suv("preto",2017));
        Toyota.add(new Conversivel("Roxo",2005));
        Toyota.add(new Sedan("vermelho",2014));
        
        //--- outra possivel execução ---
        //List<List<iCarros>> carros = new ArrayList<>();
        //carros.add(Chevrolet);
        //carros.add(Toyota);
        //for(List<iCarros> item : carros)
        //{
            //for(iCarros itens : item)
            //{
                //System.out.println(item+"\n");
            //}
        //}
        //-------------------------------
        
        System.out.println("--- Carros da Chevrolet ---");
        for(Object item : Chevrolet)
        {
            System.out.println(item+"\n");
        }
        System.out.println("--- Carros da Toyota ---");
        for(Object item : Toyota)
        {
            System.out.println(item+"\n");
        }
    }
}