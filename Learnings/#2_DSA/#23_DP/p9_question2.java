import java.util.List;

public class p9_question2 {
    public static int rec(int i, List<Integer> heights, int k, int dp[]) {
        if (i == 0) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int minCost = 1000000;
        for (int j = 1; j <= k; j++) {
            if (i - j >= 0) {
                int jump = Math.abs(heights.get(i) - heights.get(i - j)) + rec(i - j, heights, k, dp);
                minCost = Math.min(minCost, jump);
            }
        }
        return dp[i] = minCost;
    }

    public static void main(String[] args) {
        // Tabulation applied...
        List<Integer> heights = List.of(10, 30, 40, 50, 20);
        int k = 3, n = heights.size();
        int dp[] = new int[n];
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            int minCost = 1000000;
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = Math.abs(heights.get(i) - heights.get(i - j)) + dp[i - j];
                    minCost = Math.min(minCost, jump);
                }
            }
            dp[i] = minCost;
        }
        System.out.println(dp[n - 1]);
        // System.out.println(rec(n - 1, heights, k, dp));
    }
}
