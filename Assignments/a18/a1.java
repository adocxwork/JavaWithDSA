import java.util.Scanner;

public class a1 {
    static int noOfDigits(int n)
    {
        int count=0;
        while (n>0) {
            n/=10;
            count++;
        }
        return count;
    }
    static int powerOf(int x, int y)
    {
        if(y==0) return 1;
        return x * powerOf(x, y-1);
    }
    static boolean armstrongNoCheck(int nn) // normal method
    {
        int pow = noOfDigits(nn), sum=0, i, n=nn;
        while (n>0) {
            i=n%10;
            n/=10;
            sum+=powerOf(i, pow);
        }
        if(sum==nn) return true;
        return false;
    }
    static int recursiveArmstrongNoCalc(int n, int nod) //using recursion
    {
        if(n==0) return n;
        return powerOf(n%10, nod) + recursiveArmstrongNoCalc(n/10, nod);
    }
    public static void main(String[] args) {
        // System.out.println(armstrongNoCheck(1));
        // System.out.println(armstrongNoCheck(153));
        // System.out.println(armstrongNoCheck(370));
        // System.out.println(armstrongNoCheck(1634));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :-");
        int n = sc.nextInt();
        int nod = noOfDigits(n);
        int sum = recursiveArmstrongNoCalc(n, nod);
        if(n==sum)
        System.out.println("It's an armstrong number.");
        else
        System.out.println("It's not...");

        // System.out.println(recursiveArmstrongNoCalc(1,1));
        // System.out.println(recursiveArmstrongNoCalc(153,3));
        // System.out.println(recursiveArmstrongNoCalc(370,3));
        // System.out.println(recursiveArmstrongNoCalc(1634,4));
    }
}
// multiplication of x & y