package pacotePrincipal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FatorialTopDown {

    private static Map<Integer, BigInteger> cache = new HashMap<>();

    public static BigInteger calcular(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        BigInteger resultado = BigInteger.valueOf(n).multiply(calcular(n - 1));
        cache.put(n, resultado);
        
        return resultado;
    }
}
//complexidade de tempo: O(n)