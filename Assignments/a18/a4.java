public class a4 {
    static int deciToBinary(int n)
    {
        int mul=1, bi=0, i;
        while(n>0)
        {
            i = n%2;
            n/=2; //chopping
            bi+=(i*mul);
            mul*=10;
        }
        return bi;
    }
    static int deciToBinaryRecursion(int n, int mul)
    {
        if(n==0) return 0;
        int a = (n%2)*mul;
        mul*=10;
        return a + deciToBinaryRecursion(n/2, mul);
    }
    static int find(int n)
    {
        if(n==0) return 0;
        return n%2 + 10*find(n/2);
    }
    public static void main(String[] args) {
        System.out.println(deciToBinary(13));
        System.out.println(find(13));
        System.out.println(deciToBinaryRecursion(13, 1));
    }
}
