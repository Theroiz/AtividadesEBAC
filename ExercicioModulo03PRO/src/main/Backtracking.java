package main;
import java.util.ArrayList;
import java.util.List;

public class Backtracking {

    public static List<List<Integer>> encontrarSubconjuntos(int[] S, int n) {
        List<List<Integer>> resultado = new ArrayList<>();
        backtrack(resultado, new ArrayList<>(), S, n, 0);
        return resultado;
    }

    private static void backtrack(List<List<Integer>> resultado, List<Integer> atual, int[] S, int n, int inicio) {
        if (atual.size() == n) {
            resultado.add(new ArrayList<>(atual));
            return;
        }

        for (int i = inicio; i < S.length; i++) {
            atual.add(S[i]);
            backtrack(resultado, atual, S, n, i + 1);
            atual.remove(atual.size() - 1);
        }
    }
}