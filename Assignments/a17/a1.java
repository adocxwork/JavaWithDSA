public class a1{
    static void patter(int n)
    {
        if(n>0)
        {
            System.out.println(n);
            patter(n-5);
        }
        else
        {
            System.out.println(n*-1);
            patter(n-5);
        }
    }
    public static void rec(int n, int m, boolean flag) {
        System.out.print(m + " ");
        // If we are moving back towards n and we have reached there, then we are done
        if (flag == false && n == m)
                return;

        // If we are moving towards 0 or negative.
        if (flag) {
                // If m is greater, then 5, recur with true flag
                if (m - 5 > 0)
                        rec(n, m - 5, true);

                else // recur with false flag
                        rec(n, m - 5, false);
        }

        else // If flag is false.
                rec(n, m + 5, false);
}
    public static void main(String[] args) {
        patter(25);
    }
}