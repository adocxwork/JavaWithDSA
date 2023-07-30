import java.util.Scanner;

public class p40_NumericalRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Rows :-");
        int r = sc.nextInt();
        System.out.println();

        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.println(j);
            }
        }
    }
}
