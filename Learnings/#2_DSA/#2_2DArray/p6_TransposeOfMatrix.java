import java.util.Scanner;
public class p6_TransposeOfMatrix {
    static int[][] make2DArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows :-");
        int row = sc.nextInt();
        System.out.println("Enter the no of columns :-");
        int col = sc.nextInt();
        int ans[][] = new int[row][col];
        for(int i=0; i<row; i++)
        {
            System.out.println("Enter the value for row " + i);
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
    static int[][] transposeOfMatrix(int arr[][])
    {
        int row = arr[0].length, col = arr.length;
        int ans[][] = new int[row][col];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }

    static void transposeOfMatrixInPlace(int arr[][])
    {
        int r = arr.length, c=arr[0].length;
        for(int i=0; i<r; i++)
        {
            for(int j=i+1; j<c; j++)
            {
                arr[i][j] = arr[i][j] + arr[j][i];
                arr[j][i] = arr[i][j] - arr[j][i];
                arr[i][j] = arr[i][j] - arr[j][i];
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a matrix :-");
        int arr[][] = make2DArray();
        System.out.println();
        display2DArray(arr);
        
        transposeOfMatrixInPlace(arr);
        System.out.println();
        System.out.println("Transpose :-");
        display2DArray(arr);
        // int tarr[][] = transposeOfMatrix(arr);
        // System.out.println();
        // System.out.println("Transpose of matrix :-");
        // display2DArray(tarr);
    }
}
