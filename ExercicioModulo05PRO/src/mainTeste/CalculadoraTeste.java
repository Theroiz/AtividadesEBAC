package mainTeste;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import main.Calculadora;
public class CalculadoraTeste {

    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();

        Method metodoAdicionar = Calculadora.class.getDeclaredMethod("adicionar", int.class, int.class);
        metodoAdicionar.setAccessible(true);
        int resultadoSoma = (int) metodoAdicionar.invoke(calculadora, 5, 3);
        assert resultadoSoma == 8 : "falha na adição! Esperado: 8, Obtido: " + resultadoSoma;

        Method metodoSubtrair = Calculadora.class.getDeclaredMethod("subtrair", int.class, int.class);
        metodoSubtrair.setAccessible(true);
        int resultadoSubtracao = (int) metodoSubtrair.invoke(calculadora, 10, 4);
        assert resultadoSubtracao == 6 : "falha na subtração! Esperado: 6, Obtido: " + resultadoSubtracao;

        Method metodoMultiplicar = Calculadora.class.getDeclaredMethod("multiplicar", int.class, int.class);
        metodoMultiplicar.setAccessible(true);
        int resultadoMultiplicacao = (int) metodoMultiplicar.invoke(calculadora, 7, 6);
        assert resultadoMultiplicacao == 42 : "falha na multiplicacao! Esperado: 42, Obtido: " + resultadoMultiplicacao;

        Method metodoDividir = Calculadora.class.getDeclaredMethod("dividir", int.class, int.class);
        metodoDividir.setAccessible(true);
        int resultadoDivisao = (int) metodoDividir.invoke(calculadora, 20, 4);
        assert resultadoDivisao == 5 : "falha na divisao! Esperado: 5, Obtido: " + resultadoDivisao;

        boolean lancouErroCorreto = false;
        try {
            metodoDividir.invoke(calculadora, 10, 0);
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof ArithmeticException) {
                lancouErroCorreto = true;
            }
        }
        assert lancouErroCorreto : "falha! A divisão por zero não lançou a ArithmeticException esperada.";

        System.out.println("todos os testes da Calculadora passaram com sucesso!");
    }
}