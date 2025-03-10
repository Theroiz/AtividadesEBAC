
package Principal;

public class Principal {
    public static void main(String[]args)
    {
        FabricaDeCarros fabricaSedan = new FabricaSedan();
        Carro sedan = fabricaSedan.criarCarro("Toyota",94000);
        sedan.exibirDetalhes();
        
        FabricaDeCarros fabricaSUV = new FabricaSUV();
        Carro SUV = fabricaSUV.criarCarro("Honda",100000);
        SUV.exibirDetalhes();
    }
}