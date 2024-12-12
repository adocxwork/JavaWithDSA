public class p1_DP {
    public static int calls = 0;
    public static int fibbo(int n){
        calls++;
        if(n==1 || n==0) return 1;
        System.out.println("Calculating the fibo of " + n);
        return fibbo(n-1) + fibbo(n-2);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibbo(n));
        System.out.println(calls); // Recursion is too slow!!
    }
}