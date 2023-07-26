public class p7_Operators {
    public static void main(String[] args) {
        int a=5, b=10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println();

        System.out.println(a==b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println();

        System.out.println(a<=b && a!=b);
        System.out.println(a>=b && a!=b);
        System.out.println(a>=b || a!=b);
        System.out.println(a>=b || a==b);
        System.out.println(!(a==b));
        System.out.println(!(a<=b));
        System.out.println();

        int p=10, q=5;
        p+=q;
        System.out.println(p);//15
        p-=q;
        System.out.println(p);//10
        p*=q;
        System.out.println(p);//50
        p/=q;
        System.out.println(p);//10
        p%=q;
        System.out.println(p);//0
        System.out.println();

        int x=5;
        System.out.println(x++);//5
        System.out.println(++x);//7
        System.out.println(x--);//7
        System.out.println(--x);//5
    }
}
