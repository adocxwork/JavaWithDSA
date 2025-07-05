public class p21_reverseString {
    static String reverse(String s)
    {
        if(s.length()==0) return "";
        return reverse(s.substring(1)) + s.charAt(0);
    }
    static String reverse2(String s, int idx)
    {
        if(idx==s.length()) return "";
        return reverse2(s, idx+1) + s.charAt(idx);
    }
    public static void main(String[] args) {
        System.out.println(reverse("aditya gupta"));
        System.out.println(reverse2("aditya gupta", 0));
    }
}
