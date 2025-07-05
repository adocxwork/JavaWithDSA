public class p3_Fibonacci {
    static int fibo(int n)
    {
        if(n==0 || n==1) return n; //baseCase
        return (fibo(n-1)+fibo(n-2)); //subProblem + selfWork
    }
    public static void main(String[] args) {
        // first 10 fibonacci numbers
        for(int i=0; i<10; i++)
        System.out.print(fibo(i) + " ");
    }
}
