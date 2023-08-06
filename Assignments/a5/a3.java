import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :-");
        int n = sc.nextInt();
        System.out.println();

        // Write a program to calculate the factorial of a number.
        int fac = 1;
        for(int i=1; i<=n; i++)
        {
            fac = fac * i;
        }
        System.out.println("The factorial is : " + fac);
    }
}
