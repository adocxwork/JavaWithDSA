import java.util.Scanner;

public class p21_primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :-");
        int n = sc.nextInt();
        int i=2;
        while(true)
        {
            if(n==1)
            {
                System.out.println("1 is neither prime, nor composite..");
                break;
            }
            else if(n%i==0 && i!=n && i<n)
            {
                System.out.println("Not a prime number..");
                break;
            }
            else if(i>=n)
            {
                System.out.println("It's a prime number..");
                break;
            }
            i++;
        }
    }
}
