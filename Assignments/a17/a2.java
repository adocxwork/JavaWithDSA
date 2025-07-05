public class a2 {
    static int  SUM(int n, int m)
    {
        if(m==1 && n>0)
        {
            return n + SUM(n-1, m);
        }
        else if(m>1)
        return SUM(SUM(n, m-1),1);
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(SUM(4,1));
    }
}
