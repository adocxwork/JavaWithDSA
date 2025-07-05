import java.util.Scanner;

public class p45_NumericTriangleHollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :-");
        int r = sc.nextInt();
        System.out.println();

        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=(r-i); j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=(i*2-1); k++)
            {
                if(i==1 || i==r || k==1 || k==(i*2-1))
                {
                    System.out.print(i);
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
