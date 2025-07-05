import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :-");
        int n = sc.nextInt();
        if(n<0)
        {
            System.out.println((n*-1));
        }
        else
        {
            System.out.println(n);
        }
    }
}
