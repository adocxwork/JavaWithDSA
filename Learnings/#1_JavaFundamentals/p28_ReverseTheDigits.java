import java.util.Scanner;

public class p28_ReverseTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :-");
        int n = sc.nextInt();
        String reverseNum = "";
        while(n>0)
        {
            reverseNum = reverseNum + (n%10);
            n/=10;
        }
        System.out.println("Reverse Number : " + reverseNum);
    }
}
