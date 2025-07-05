import java.util.Scanner;

public class p22_palindrome {
    static boolean isPalindrome(String s)
    {
        int i=0, j=s.length()-1;
        while (i<j) {
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    static boolean isPalindrome2(String s, int i, int j)
    {
        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return isPalindrome2(s, ++i, --j);
    }
    static String reverse(String s)
    {
        if(s.length()==0) return "";
        return reverse(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = reverse(s);
        if(rev.equals(s))
        {
            System.out.println("Palindrome..");
        }
        else
        {
            System.out.println("Not Palindrome..");
        }
    }
}
