import java.util.Scanner;

public class p46_BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary Number :-");
        int bi = sc.nextInt();
        System.out.println();
        int ans = 0;
        int power = 1;

        while(bi>0)
        {
            ans = ans + ((bi%10)*power);
            bi = bi / 10;
            power = power * 2;
        }
        System.out.println("Decimal Number is : " + ans);
        sc.close();
    }
}
