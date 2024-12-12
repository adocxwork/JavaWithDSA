public class p5_tabulation {

    public static int fibo(int n, int dp[]) {
        if (dp[n] != -1) {
            return dp[n];
        }
        if (n == 1 || n == 2) { //base condition
            return dp[n] = 1;
        }
        return dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp);
    }

    public static void main(String[] args) {
        int n = 10;
        // int dp[] = new int[n + 1];
        // for (int i = 0; i <= n; i++) {
        //     dp[i] = -1;
        // }
        // dp[1] = 1;
        // dp[2] = 1;

        int prev1=1, prev2=1, curr=0;
        for (int i = 3; i <= n; i++) {
            curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
            // dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(curr);
        // System.out.println(dp[n]);
    }
}
