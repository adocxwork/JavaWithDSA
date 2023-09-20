import java.util.Scanner;

public class a1{
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
    static int[][] multiplyMatrices(int arr1[][], int arr2[][])
    {
        int row = arr1.length;
        int col = arr2[0].length;
        int ans[][] = new int[row][col];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                for(int k=0; k<arr1[0].length; k++)
                {
                    ans[i][j] = ans[i][j] + (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr1[][] = make2DArray();
        System.out.println();
        int arr2[][] = make2DArray();
        System.out.println();

        System.out.println("Matrix 1");
        display2DArray(arr1);
        System.out.println("Matrix 1");
        display2DArray(arr2);
        System.out.println();
        if(arr1[0].length == arr2.length)
        {
            int ans[][] = multiplyMatrices(arr1, arr2);
            System.out.println("The product is :-");
            System.out.println();
            display2DArray(ans);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}