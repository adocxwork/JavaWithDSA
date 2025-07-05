import java.util.Scanner;

public class p30_SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :-");
        int n = sc.nextInt();
        int sum = 0;

        int i=0;
        while(i<=n)
        {
            if(i%2==0)
            {
                sum = sum - i;
            }
            else
            {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("The sum is : " + sum);
    }
}
