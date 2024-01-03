public class p18_strings {
    public static void main(String[] args) {
        String s = "Aditya";

        // traversing the string s
        for(int i=0; i<s.length(); i++)
        {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();

        // printing the substring
        System.out.println(s.substring(2, 5));
    }
}
