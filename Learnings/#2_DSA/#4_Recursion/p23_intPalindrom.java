public class p23_intPalindrom {
    static int leftCalc(int n)
    {
        while(n>9)
        {
            n/=10;
        }
        return n;
    }
    static boolean isPalindrome(int n)
    {
        if(n>=0 && n<=9) return true;
        int right=n%10, left = leftCalc(n), temp=0;
        n/=10;
        while(n>9)
        {
            temp*=10;
            temp+=n%10;
            n/=10;
        }
        if(right!=left) return false;
        return isPalindrome(temp);
    }
    public static void main(String[] args) {
        int k=122;
        System.out.println(isPalindrome(k));
    }
}
