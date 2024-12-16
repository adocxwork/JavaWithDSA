
/*
There are N stones, numbered 1,2,...,N. The height of ith stone is h₁. There is a frog who is initially on Stone 1.
He will repeat an action some number of times to reach Stone N. The action is that if the frog is currently on Stone i,
it jumps to one of the following: Interview Problems On DP... Stone i+1,i+2,.., i+k. Here, a cost of lh - hil is incurred,
where j is the stone to land on. Find the minimum possible total cost incurred before the frog reaches Stone N.

Inputl: n = 5 k = 3
10 30 40 50 20
Outputl: 30

Input2: n=3 k=1
10 20 10
Output2: 20
*/
import java.util.*;
// memoization applied...
public class p9_question {
    public static int rec(int i, List<Integer> heights, int k, int dp[]) {
        if (i == 0) {
            return 0;
        }
        if(dp[i]!=-1){
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
        List<Integer> heights = List.of(10, 30, 40, 50, 20);
        int k = 3, n = heights.size();
        int dp[] = new int[n];
        for(int i=0; i<n; i++){
            dp[i] = -1;
        }
        System.out.println(rec(n-1, heights, k, dp));
    }
}
