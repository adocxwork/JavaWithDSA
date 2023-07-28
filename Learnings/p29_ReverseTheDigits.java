import java.util.Scanner;

public class p29_ReverseTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :-");
        
        int n = sc.nextInt();
        int reverseNum = 0;
        while(true)
        {
            reverseNum = reverseNum + (n%10);
            n = n / 10;
            if(n>0)
            {
                reverseNum = reverseNum * (10);
            }
            else if(n<=0)
            {
                break;
            }
        }


        System.out.println("Reverse Number : " + reverseNum);
    }
}
// 14:26