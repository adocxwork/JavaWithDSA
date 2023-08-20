import java.util.Scanner;

public class p26_NoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :-");
        int n = sc.nextInt();
        int i=0;
        while(n>0)
        {
            n/=10;
            i++;
        }
        System.out.println("No of digits : " + i);
    }
}
