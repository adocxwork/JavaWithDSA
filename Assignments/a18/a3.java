public class a3 {
    static boolean primeCheck(int n)
    {
        if(n==1) return false;
        int d=2;
        while(d<=n/2)
        {
            if(n%d==0)
            {
                return false;
            }
            d++;
        }
        return true;
    }
    static boolean primeCheckRecursion(int n, int d)
    {
        if(d==1) return true;
        else if(d==0) return false;
        else if(n%d==0) return false;
        else return primeCheckRecursion(n, d-1);
    }
    public static void main(String[] args) {
        for(int i=1; i<=20; i++)
            System.out.println(i + " " + primeCheck(i) + " " + primeCheckRecursion(i, i/2));
    }
}
