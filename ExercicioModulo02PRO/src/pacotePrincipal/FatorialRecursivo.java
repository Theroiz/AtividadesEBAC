package pacotePrincipal;
import java.math.BigInteger;

public class FatorialRecursivo {

    public static BigInteger calcular(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(calcular(n - 1));
    }
}

//complexidade de tempo: O(2)