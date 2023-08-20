import java.util.Scanner;

public class p47_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal Number :-");
        int dn = sc.nextInt();
        System.out.println();
        int ans = 0;
        int mul = 1;
        while(dn>0)
        {
            ans = ans + ((dn%2)*mul);
            dn = dn/2;
            mul = mul * 10;
        }
        System.out.println("Binary Number : " + ans);
    }
}
