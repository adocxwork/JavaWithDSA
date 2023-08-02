import java.util.Scanner;

public class p40_NumericalRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Rows :-");
        int r = sc.nextInt();
        System.out.println();

        for(int i=1; i<=r; i++)
        {
            for(int j=i; j<=r; j++)
            {
                System.out.print(j + " ");
            }
            for(int k=1; k<i; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
