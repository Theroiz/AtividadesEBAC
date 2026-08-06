package main;
import java.util.List;

public class ClassePrincipal {

    public static void main(String[] args) {
        
        System.out.println("    TESTANDO BACKTRACKING        ");
        System.out.println("=================================");
        
        int[] S1 = {1, 2, 3};
        int n1 = 2;
        List<List<Integer>> resultado1 = Backtracking.encontrarSubconjuntos(S1, n1);
        System.out.println("Entrada: S = [1, 2, 3], n = 2");
        System.out.println("Saida: " + resultado1);

        System.out.println();

        int[] S2 = {1, 2, 3, 4};
        int n2 = 1;
        List<List<Integer>> resultado2 = Backtracking.encontrarSubconjuntos(S2, n2);
        System.out.println("Entrada: S = [1, 2, 3, 4], n = 1");
        System.out.println("Saida: " + resultado2);

        System.out.println("    TESTANDO ALGORITMO GULOSO    ");
        System.out.println("=================================");
        
        int quantia = 18;
        int[] moedas = {5, 2, 1}; 
        int totalMoedas = Troco.calcularMenorNumeroMoedas(quantia, moedas);
        
        System.out.println("Entrada: Quantia 18, Moedas disponíveis 5, 2 e 1");
        System.out.println("Saida: " + totalMoedas);
    }
}