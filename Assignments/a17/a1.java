public class a1{
    static void pattern(int n, int m, boolean f)
    {
        System.out.print(n + " ");
        if(f==false && n==m) return;
        if(n<=0) f=false;
        if(f)
            pattern(n-5, m, f);
        if(f==false)
            pattern(n+5, m, f);
    }
    public static void main(String[] args) {
        pattern(25, 25, true);
    }
}