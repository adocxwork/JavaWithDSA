import java.util.Scanner;

public class p38_RealTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Rows :-");
        int r = sc.nextInt();
        System.out.println();

        for(int i=r; i>=1; i--)
        {
            for(int j=1; j<i; j++)
            {
                System.out.print("  ");
            }
            for(int k=1; k<=(2*(r-(i-1))-1); k++)
            {
                System.out.print("* ");
            }
            // for(int l=1; l<=2; l++)
            // {
            //     System.out.print("* ");
            // }
            System.out.println();
        }
    }
}
