public class p9_GCD {
    static int GCD(int x, int y)
    {
        if(x==y) return x;
        else if(x>y)
            return GCD(x-y, y);
        else
            return GCD(x, y-x);
    }
    static int bruteForceGCD(int x, int y)
    {
        int s;
        if(x>y) s=y;
        else s=x;
        while(s>0)
        {
            if(x%s==0 && y%s==0) return s;
            else s--;
        }
        return s;
    }
    static int GCD2(int x, int y) //iterative method
    {
        while(x%y!=0)
        {
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    static int GCD3(int x, int y) //euclid's algo, recursion | best approach
    {
        if(y==0) return x;
        return GCD3(y,x%y);
    }
    public static void main(String[] args) {
        System.out.println(GCD(12,16));
        System.out.println(GCD2(12,16));
        System.out.println(GCD3(12,16));
        // System.out.println(bruteForceGCD(12,16));
    }
}
