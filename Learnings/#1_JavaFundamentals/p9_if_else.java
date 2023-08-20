import java.util.Scanner;

public class p9_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character :-");
        char ch = sc.next().charAt(0);
        if(ch=='a')
        {
            System.out.println("Yes, it's 'a'");
        }
        else
        {
            System.out.println("No, it's not 'a'");
        }
        sc.close();
    }
}
