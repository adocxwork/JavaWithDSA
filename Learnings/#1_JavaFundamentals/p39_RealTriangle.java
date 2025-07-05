import java.util.Scanner;

public class p39_RealTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Rows :-");
        int r = sc.nextInt();
        System.out.println();

        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=(r-i); j++)
            {
                System.out.print("  ");
            }
            for(int k=1; k<=((i*2)-1); k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
