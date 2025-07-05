// Write a program to enter the numbers till the user wants, the number can be positive,
// negative or zero. Calculate the sum of numbers until a negative number is encountered.
// If the input is a negative number, current sum is discarded and print -1.
import java.util.Scanner;
public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of sum you want to perform :-");
        int n = sc.nextInt();
        System.out.println();

        int ele = 0;
        int sum = 0;
        boolean nNo = false;

        System.out.println("Enter the Numbers :-");
        for(int i=1; i<=n; i++)
        {
            ele = sc.nextInt();
            if(ele >= 0)
            {
                sum = sum + ele;
            }
            else
            {
                nNo = true;
                break;
            }
        }
        if(nNo==true)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(sum);
        }
    }
}
