package mainTeste;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import main.Calculadora;

public class CalculadoraTeste {

    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    private Object invocarMetodoPrivado(String nomeMetodo, int a, int b) throws Exception {
        Method metodo = Calculadora.class.getDeclaredMethod(nomeMetodo, int.class, int.class);
        metodo.setAccessible(true);
        return metodo.invoke(calculadora, a, b);
    }

    @Test
    public void testAdicionar() throws Exception {
        int resultado = (int) invocarMetodoPrivado("adicionar", 5, 3);
        assertEquals(8, resultado);
    }

    @Test
    public void testSubtrair() throws Exception {
        int resultado = (int) invocarMetodoPrivado("subtrair", 10, 4);
        assertEquals(6, resultado);
    }

    @Test
    public void testMultiplicar() throws Exception {
        int resultado = (int) invocarMetodoPrivado("multiplicar", 7, 6);
        assertEquals(42, resultado);
    }

    @Test
    public void testDividir() throws Exception {
        int resultado = (int) invocarMetodoPrivado("dividir", 20, 4);
        assertEquals(5, resultado);
    }

    @Test
    public void testDividirPorZero() {
        InvocationTargetException excecao = assertThrows(InvocationTargetException.class, () -> {
            invocarMetodoPrivado("dividir", 10, 0);
        });
        
        assertEquals(ArithmeticException.class, excecao.getCause().getClass());
    }
}