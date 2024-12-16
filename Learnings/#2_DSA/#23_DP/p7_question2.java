import java.util.*;

public class p7_question2 {
    // tabulation applied...
    public static int rec(int idx, int w, List<Integer> profit, List<Integer> weights, int dp[][]) {
        if(dp[idx][w] != -1){
            return dp[idx][w];
        }
        if(idx==0){ //base condition...
            if(weights.get(0)<=w){
                return profit.get(0);
            } else{
                return 0;
            }
        }
        int pick = 0;
        if(w>=weights.get(idx)){
            pick = profit.get(idx) + rec(idx-1, w-weights.get(idx), profit, weights, dp);
        }
        int notPick = rec(idx-1, w, profit, weights, dp);
        return dp[idx][w] = Math.max(pick, notPick);
    }
    public static void main(String[] args) {
        List<Integer> profit = List.of(1,2,3);
        List<Integer> weights = List.of(4,5,1);
        int wt = 4;
        int n = profit.size();
        int dp[][] = new int[n+1][wt+1];
        
        // base condition...
        for(int i=0; i<=wt; i++){
            if(weights.get(0)<=i)
            dp[0][i] = profit.get(0);
            else
            dp[0][i] = 0;
        }
        
        for(int idx=1; idx<n; idx++){
            for(int w=0; w<=wt; w++){
                int pick = 0;
                if(w>=weights.get(idx)){
                    pick = profit.get(idx) + dp[idx-1][w-weights.get(idx)];
                }
                int notPick = dp[idx-1][w];
                dp[idx][w] = Math.max(pick, notPick);
            }
        }

        System.out.println(dp[n-1][wt]);
        // System.out.println(rec(n-1, wt, profit, weights, dp));
    }
}
