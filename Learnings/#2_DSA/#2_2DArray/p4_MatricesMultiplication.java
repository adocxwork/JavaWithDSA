import java.util.Scanner;

public class p4_MatricesMultiplication {
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

    static int[][] multiplicationOfTwo2DArray(int arr1[][], int arr2[][])
    {
        int ans[][] = new int[arr1.length][arr2[0].length];
        for(int i=0; i<ans.length; i++)
        {
            for(int j=0; j<ans[i].length; j++)
            {
                for(int k=0; k<arr2.length; k++)
                {
                    ans[i][j] = ans[i][j] + (arr1[i][k] * arr2[k][j]); 
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr1[][] = make2DArray();
        int arr2[][] = make2DArray();
        System.out.println();
        display2DArray(arr1);
        System.out.println();
        display2DArray(arr2);
        System.out.println();

        if(arr1[0].length==arr2.length)
        {
            int productOfMatrix[][] = multiplicationOfTwo2DArray(arr1, arr2);
            System.out.println("The product of two matrices is :-");
            display2DArray(productOfMatrix);
        }
        else
        {
            System.out.println("The dimensions of matrices aren't correct.");
        }
    }
}