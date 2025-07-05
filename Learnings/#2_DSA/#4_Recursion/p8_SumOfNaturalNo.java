public class p8_SumOfNaturalNo {
    static int sumOfNo(int n)
    {
        if(n==0) return 0;
        return n + sumOfNo(n-1);
    }
    static int sumOfNaturalNo(int n) //with alternate sign
    {
        if(n==0) return 0;
        if(n%2==0) return sumOfNaturalNo(n-1) - n;
        else return sumOfNaturalNo(n-1) + n;
    }
    public static void main(String[] args) {
        // System.out.println(sumOfNaturalNo(4));
        System.out.println(sumOfNaturalNo(10));
    }
}
