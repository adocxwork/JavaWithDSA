import java.util.Scanner;

public class a4 {
    static int[][] make2DArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows & columns :-");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int ans[][] = new int[row][col];
        for(int i=0; i<row; i++)
        {
            System.out.println("Enter the values for row " + i);
            for(int j=0; j<col; j++)
            {
                ans[i][j] = sc.nextInt();
            }
        }
        return ans;
    }
    static void display2DArray(int arr[][])
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
    static int[] diagonalElementsOfMatrix(int arr[][])
    {
        int r = arr.length, c = arr[0].length;
        int ans[] = new int[(r*c)];
        // code karna baki hai
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
