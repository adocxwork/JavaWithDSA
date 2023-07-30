import java.util.Scanner;

public class p36_DownTrianlge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of Rows :-");
        int r = sc.nextInt();
        System.out.println();

        for(int i=r; i>=1; i--)
        {
            for(int j=i; j>=1; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
