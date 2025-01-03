/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money
stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems
connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
Given an integer array nums representing the amount of money of each house, return the maximum amount of money
you can rob tonight without alerting the police.

Input1: nums = [1,2,3,1]
Outputl: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob =1+3=4.

Input2: nums = [2,7,9,3,1]
Output2: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 = 1).
Total amount you can rob = 2+9+1=12
 */
public class p3_question {
    public static int calls = 0;
    // overlapping subproblem
    // optimal substructure
    public static int rob(int[] houses, int ind, int dp[]) { // TC = O(n), SC = O(n)
        calls++;
        if (ind == houses.length - 1)
            return houses[ind];
        if (ind >= houses.length)
            return 0;
        if(dp[ind] != -1)
            return dp[ind];
        int pick = houses[ind] + rob(houses, ind + 2, dp);
        int not_pick = rob(houses, ind + 1, dp);
        return dp[ind] = Math.max(pick, not_pick);
    }

    public static void main(String[] args) {
        int n = 7;
        int houses[] = {9,1,3,8,2,7,6};
        int dp[] = new int[n];
        for(int i=0; i<n; i++){
            dp[i] = -1;
        }
        System.out.println(rob(houses, 0, dp));

        System.out.println("Calls : " + calls);
    }
}
