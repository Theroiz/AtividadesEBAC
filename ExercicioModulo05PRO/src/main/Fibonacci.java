package main;
import java.math.BigInteger;

public class Fibonacci {

	public static BigInteger calcular(int n) {
        if (n == 0) {
            return BigInteger.ZERO;
        }
        if (n == 1) {
            return BigInteger.ONE;
        }
        return calcular(n - 1).add(calcular(n - 2));
    }
}
//complexidade de tempo: O(2)