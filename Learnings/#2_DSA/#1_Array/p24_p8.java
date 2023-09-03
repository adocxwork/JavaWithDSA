// swap two numbers

import java.util.Scanner;

public class p24_p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("Enter the value of a :-");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :-");
        int b = sc.nextInt();

        System.out.println("The value of a : " + a);
        System.out.println("The value of b : " + b);
        System.out.println();
        
        temp = b;
        b = a;
        a = temp;

        System.out.println("The value of a : " + a);
        System.out.println("The value of b : " + b);
        sc.close();
    }
}
