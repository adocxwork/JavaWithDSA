import java.util.Scanner;

public class p33_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of Rows :-");
        int r = sc.nextInt();
        System.out.println("Enter the No of Columns :-");
        int c = sc.nextInt();

        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
