import java.util.*;

public class p11_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string :-");
        StringBuilder str = new StringBuilder(sc.nextLine());
        for (int i = 0; i < str.length(); i++) {
            char t = str.charAt(i);
            if (t == ' ' || (t >= '0' && t <= '9'))
                continue;
            if ((int) t >= 65 && (int) t <= 90) {
                t = (char) ((int) t + 32);
            } else {
                t = (char) ((int) t - 32);
            }
            str.setCharAt(i, t);
        }
        System.out.println(str);
    }
}
