import java.util.Scanner;

public class p32_Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :-");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :-");
        int b = sc.nextInt();

        int ans = 1;
        for(int i=1; i<=b; i++)
        {
            ans*=a;
        }
        System.out.println("The value of a raised to the power b is : " + ans);
    }
}
