import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :-");
        int n = sc.nextInt();
        int m=0;

        while(true)
        {
            if(n>0)
            {
                m = m + (n%10);
                n/=10;
            }
            else
            {
                break;
            }
        }
        System.out.println("Sum is : " + m);
    }
}
