import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :-");
        int n = sc.nextInt();
        if(n<0)
        {
            System.out.println("It's a negative number...");
        }
        else
        {
            System.out.println("The number is : " + n);
        }
    }
}
