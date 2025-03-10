
package Principal;


public class SUV implements Carro {
    private String marca;
    private double preco;
    
    public SUV (String marca,double preco)
    {
        this.marca = marca;
        this.preco = preco;
    }
    
    public void exibirDetalhes()
    {
        System.out.println("Carro SUV:\n"+marca+", preço: R$"+preco);
    }
}