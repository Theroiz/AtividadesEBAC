
package Principal;

public class FabricaSedan implements FabricaDeCarros {
    public Carro criarCarro(String marca,double preco)
    {
        return new Sedan(marca,preco);
    }
}
