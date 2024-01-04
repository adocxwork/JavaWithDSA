public class p22_palindrome {
    static boolean palindrome(String s, int idx)
    {
        if(idx==s.length()) return true;
        if(s.charAt(idx)!=s.charAt(s.length()-1-idx)) return false;
        return palindrome(s, idx+1);
    }
    public static void main(String[] args) {
        System.out.println(palindrome("null", 0));
    }
}
