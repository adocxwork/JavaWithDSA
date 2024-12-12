/*
A message containing letters from A-Z can be encoded into numbers using the following mapping:
"A" -> 1, "B" -> 2, ..., "Z" -> 26

To decode an encoded message, all the digits must be grouped then mapped back into letters using
the reverse of the mapping above (there may be multiple ways). For example, "11106" can be mapped into:
"AAJF" with the grouping (1 1 10 6)
"KJF" with the grouping (11 10 6)
Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from "06".
Given a string s containing only digits, return the number of ways to decode it.

Input1: s = "12"
Output1: 2
Explanation: "12" could be decoded as "AB" (1 2) or "L" (12).

Input2: s = "226"
Output2: 3
Explanation: "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
*/
public class p4_question {
    public static int calls = 0;
    public static int no_of_ways(String number, int idx, int dp[]){
        calls++;
        if(idx<=0) return 1;
        if(dp[idx] != -1) return dp[idx];
        int not_combine = 0;
        if(number.charAt(idx)!='0')
            not_combine = no_of_ways(number, idx-1, dp);
        int combine = 0;
        if(number.charAt(idx-1)=='1' || (number.charAt(idx-1) == '2' && number.charAt(idx) <= '6')){
            combine = no_of_ways(number, idx-2, dp);
        }
        return dp[idx] = combine + not_combine;
    }
    public static void main(String[] args) {
        String number = "11126";
        int n = number.length();
        int dp[] = new int[n];
        for(int i=0; i<n; i++){
            dp[i] = -1;
        }
        System.out.println(no_of_ways(number, n-1, dp));

        System.out.println("Calls : " + calls);
    }
}
