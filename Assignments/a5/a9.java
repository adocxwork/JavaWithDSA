// Write a program to check whether a prime Number can be expressed as a Sum of Two
// Prime Numbers. 

import java.util.Scanner;

public class a9 {
    static boolean isPrime(int a)
    {
        boolean pOrNot = true;
        for(int i=2; i<a; i++)
        {
            if(a%i==0 && i!=a)
            {
                pOrNot = false;
                break;
            }
        }
        return pOrNot;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Prime Number :-");
        int pm = sc.nextInt();
        System.out.println();

        boolean condition = false;

        for(int j=2; j<pm; j++)
        {
            if(isPrime(j) && isPrime(pm-j))
            {
                condition=true;
                break;
            }
        }

        System.out.println(condition);
        sc.close();
    }
}
