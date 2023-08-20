import java.util.Scanner;

public class p13_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num :-");
        int n = sc.nextInt();
        if(n%3==0 || n%5==0)
        {

            System.out.println(n);
        }
    }
}
