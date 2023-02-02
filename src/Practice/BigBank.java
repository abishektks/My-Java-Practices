package Practice;

import java.math.BigInteger;
import java.util.Scanner;

public class BigBank {
    static final int MOD = 1000000007;
    static BigInteger[][] dp = new BigInteger[5005][5005];
    static BigInteger f(int n, int k) {
        if (k == 0) return BigInteger.ONE;
        if (dp[n][k] != null) return dp[n][k];
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= n; i++) {
            sum = sum.add(f(n-i, k-1));
        }
        dp[n][k] = sum;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            System.out.println(f(n, k).mod(BigInteger.valueOf(MOD)));
        }
    }
}
