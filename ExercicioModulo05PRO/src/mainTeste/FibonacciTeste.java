package mainTeste;
import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import main.Fibonacci;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTeste {

    @Test
    public void testFibonacciCasoBaseZero() {
        assertEquals(BigInteger.ZERO, Fibonacci.calcular(0));
    }

    @Test
    public void testFibonacciCasoBaseUm() {
        assertEquals(BigInteger.ONE, Fibonacci.calcular(1));
    }

    @Test
    public void testFibonacciCenarioRegular() {
        assertEquals(BigInteger.valueOf(13), Fibonacci.calcular(7));
    }
}