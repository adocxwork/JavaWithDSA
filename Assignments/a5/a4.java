import java.util.Scanner;
import java.lang.Math;
public class a4 {
    static int NumberOfDigits(int q)
    {
        int digitsNum = 0;
        while(q>0)
        {
            q=q/10;
            digitsNum = digitsNum + 1;
        }
        return digitsNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :-");
        int n = sc.nextInt();
        System.out.println();
        // Write a program to print all Armstrong numbers between 1 to n.
        // A three digit number is called the Armstrong number if the sum of
        // the cube of its digit is equal to the number itself.
        // E.g.- 153 is an Armstrong number because (1^3)+(5^3)+(3^3) = 153.

        int temp1=0, temp2=0;
        double sum=0;
        for(int i=1; i<=n; i++)
        {
            temp1 = i;
            while(temp1>0)
            {
                temp2 = temp1%10;
                temp1 = temp1/10;
                sum = sum + (Math.pow(temp2, NumberOfDigits(i)));
            }

            if(sum == i)
            {
                System.out.println("Armstrong Number : " + i);
            }
            sum = 0;
        }
    }
}
