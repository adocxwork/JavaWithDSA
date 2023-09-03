import java.util.Scanner;

public class p2_TakingInputs {
    static void print2DArray(int arr[][])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] TakingInputs()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :-");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns :-");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        for(int i=0; i<r; i++)
        {
            System.out.println("Enter the value for row " + i);
            for(int j=0; j<c; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();
        return arr;
    }
    public static void main(String[] args) {
        int myArray[][] = TakingInputs();
        print2DArray(myArray);
    }
}
