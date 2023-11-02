public class p10_Armstrong {
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
    static boolean recursiveArmstrongCheck(int n)
    {
        if(n==powerOf(n, noOfDigits(n)))
        return true;
        return recursiveArmstrongCheck(n/10);
    }
    public static void main(String[] args) {
        // System.out.println(armstrongNoCheck(1));
        // System.out.println(armstrongNoCheck(153));
        // System.out.println(armstrongNoCheck(370));
        // System.out.println(armstrongNoCheck(1634));

        // // this is not armstrong
        // System.out.println(armstrongNoCheck(372));
        // System.out.println(armstrongNoCheck(3483));

        System.out.println(recursiveArmstrongCheck(1));
        System.out.println(recursiveArmstrongCheck(153));
        System.out.println(recursiveArmstrongCheck(370));
        System.out.println(recursiveArmstrongCheck(377));
    }
}
// multiplication of x & y