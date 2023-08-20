import java.util.Scanner;

public class p37_DownTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of Rows :-");
        int r = sc.nextInt();
        System.out.println();

        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=(r+1-i); j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
