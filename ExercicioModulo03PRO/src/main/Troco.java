package main;
public class Troco {

    public static int calcularMenorNumeroMoedas(int quantia, int[] moedas) {
        int quantidadeMoedas = 0;
        int valorRestante = quantia;

        for (int moeda : moedas) {
            if (valorRestante == 0) {
                break;
            }
            int qtdMoedaAtual = valorRestante / moeda;
            quantidadeMoedas += qtdMoedaAtual;
            valorRestante %= moeda;
        }
        return quantidadeMoedas;
    }
}