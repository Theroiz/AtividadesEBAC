
package Principal;

public class Sedan implements Carro {
    private String marca;
    private double preco;
    
    public Sedan(String marca,double preco)
    {
        this.marca = marca;
        this.preco = preco;
    }
    
    public void exibirDetalhes()
    {
        System.out.println("Carro Sedan:\n"+marca+",preço: R$"+preco);
    }
}
