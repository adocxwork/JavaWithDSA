public class p1_DP {
    public static int fibbo(int n){
        if(n==1 || n==0) return 1;
        System.out.println("Calculating the fibo of " + n);
        return fibbo(n-1) + fibbo(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibbo(n));
    }
}