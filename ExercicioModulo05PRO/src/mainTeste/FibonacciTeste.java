package mainTeste;
import main.Fibonacci;
import java.math.BigInteger;

public class FibonacciTeste {

    public static void main(String[] args) {
        
        BigInteger resultadoBaseZero = Fibonacci.calcular(0);
        assert resultadoBaseZero.equals(BigInteger.ZERO) : "Falha no caso base 0! Esperado: 0";

        BigInteger resultadoBaseUm = Fibonacci.calcular(1);
        assert resultadoBaseUm.equals(BigInteger.ONE) : "falha no caso base 1! Esperado: 1";

        BigInteger resultadoRegular = Fibonacci.calcular(7);
        assert resultadoRegular.equals(BigInteger.valueOf(13)) : "falha no caso regular! Esperado: 13";

        System.out.println("todos os testes do verdadeiro Fibonacci passaram com sucesso!");
    }
}