public class p2_Memoization {
    public static int calls = 0;
    public static int fibbo(int n, int dp[]){
        if(n==1 || n==0) return 1;
        if(dp[n] != -1)  return dp[n];
        calls++;
        dp[n] = fibbo(n-1, dp) + fibbo(n-2, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 10;
        int dp[] = new int[n+1];
        for(int i=0; i<=n; i++){
            dp[i] = -1; // for check...
        }
        System.out.println(fibbo(n, dp));

        System.out.println("No of calls : " + calls);
    }
}
