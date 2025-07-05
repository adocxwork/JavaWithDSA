/*
We are given N items where each item has some weight and profit associated with it. We are also given a bag with capacity W,
[i.e., the bag can hold at most W weight in it]. The target is to put the items into the bag such that the sum of profits
associated with them is the maximum possible.

Inputi: N = 3 W = 4 profit[] = {1, 2, 3}, weight[] I = \{4, 5, 1\}
Outputl: 3
Explanation: There are two items which have weight less than or equal to 4. If we select the item with weight 4,
the possible profit is 1. And if we select the item with weight 1, the possible profit is 3. So the maximum possible profit is 3.
Note that we cannot put both the items with weight 4 and 1 together as the capacity of the bag is 4.


Input2: N = 3 W = 3 profit[] = {1, 2, 3}, weight[] = {4, 5, 6}
Output2: 0
*/
import java.util.*;

public class p7_question {
    // Memoization applied...
    public static int rec(int idx, int w, List<Integer> profit, List<Integer> weights, int dp[][]) {
        if(dp[idx][w] != -1){
            return dp[idx][w];
        }
        if(idx==0){
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
        int w = 4;
        int n = profit.size();
        int dp[][] = new int[n+1][w+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=w; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(rec(n-1, w, profit, weights, dp));
    }
}
