package main;
public class Calculadora {

    /**
     * Realiza a soma entre dois números inteiros.
     *
     * @param a O primeiro número da operação.
     * @param b O segundo número da operação.
     * @return O resultado da adição.
     */
    private int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração entre dois números inteiros.
     *
     * @param a O valor base (minuendo).
     * @param b O valor a ser subtraído (subtraendo).
     * @return O resultado da subtração.
     */
    private int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação entre dois números inteiros.
     *
     * @param a O primeiro fator.
     * @param b O segundo fator.
     * @return O produto da multiplicação.
     */
    private int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão exata entre dois números inteiros.
     * 
     * @param a O número a ser dividido (dividendo).
     * @param b O número pelo qual se divide (divisor).
     * @return O quociente da divisão.
     * @throws ArithmeticException Se o divisor (b) for igual a zero.
     */
    private int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}