public class p4_SumOfDigits {
    static int sumOfDigits(int n)
    {
        if(n>=0 && n<=9) return n; //base case
        return (n%10) + sumOfDigits(n/10); //sub problem + self work
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(31));
    }
}
