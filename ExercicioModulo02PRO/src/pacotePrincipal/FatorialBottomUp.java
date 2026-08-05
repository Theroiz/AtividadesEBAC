package pacotePrincipal;
import java.math.BigInteger;

public class FatorialBottomUp {

    public static BigInteger calcular(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }

        BigInteger[] dp = new BigInteger[n + 1];
        dp[0] = BigInteger.ONE;
        dp[1] = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1].multiply(BigInteger.valueOf(i));
        }

        return dp[n];
    }
}
//complexidade de tempo: O(n)