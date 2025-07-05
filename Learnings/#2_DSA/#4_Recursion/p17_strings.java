import java.util.Scanner;

public class p17_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next(); //single word
        System.out.println(s);

        String ss = sc.nextLine(); //multiple words, delimiter - EOL
        System.out.println(ss);
    }
}
