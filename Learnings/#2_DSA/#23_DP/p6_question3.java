import java.util.List;

public class p6_question3 {
    public static int rec(List<Integer> coins, int sum, int idx, int[][] dp) {
        if (dp[idx][sum] != -1) {
            return dp[idx][sum];
        }
        if (idx == 0) { // base condition
            if (sum % coins.get(idx) == 0)
                return 1;
            else
                return 0;
        }
        int pick = 0;
        if (sum >= coins.get(idx)) {
            pick = rec(coins, sum - coins.get(idx), idx, dp);
        }
        int notPick = rec(coins, sum, idx - 1, dp);
        return dp[idx][sum] = pick + notPick;
    }

    public static void main(String[] args) {
        List<Integer> coins = List.of(1, 2, 3);
        int n = coins.size();
        int totalSum = 4;
    
        int cur[] = new int[totalSum + 1];
        int prev[] = new int[totalSum + 1];
        for (int i = 0; i <= totalSum; i++) {
            cur[i] = 0;
            if (i % coins.get(0) == 0)
                prev[i] = 1;
            else
                prev[i] = 0;
        }

        for (int idx = 1; idx < n; idx++) {
            for (int sum = 0; sum <= totalSum; sum++) {
                int pick = 0;
                if (sum >= coins.get(idx)) {
                    pick = cur[sum - coins.get(idx)];
                }
                int notPick = prev[sum];
                cur[sum] = pick + notPick;
            }
            prev = cur;
        }
        System.out.println(prev[totalSum]);
        // System.out.println(rec(coins, totalSum, n-1, dp));
    }
}
