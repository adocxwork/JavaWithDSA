public class p5_NoOfDigits
{
    static int noOfDigits(int n)
    {
        if(n>=0 && n<=9) return 1; //base case
        return 1 + noOfDigits(n/10); //sub problem + self work
    }
    public static void main(String[] args) {
        System.out.println(noOfDigits(532));
    }
}