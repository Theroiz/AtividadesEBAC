
package Principal;

public class FabricaSUV implements FabricaDeCarros {
    public Carro criarCarro(String marca,double preco)
    {
        return new SUV(marca,preco);
    }
}
