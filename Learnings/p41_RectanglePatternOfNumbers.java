import java.util.Scanner;

public class p41_RectanglePatternOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of Rows :-");
        int r = sc.nextInt();
        System.out.println("Enter the No of Columns :-");
        int c = sc.nextInt();

        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=c; j++)
            {
                if(i==1 || j==1 || i==r || j==c)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
