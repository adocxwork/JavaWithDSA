import java.util.Scanner;

public class a3 {
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
    static int sumOf2DWithGivenRange(int arr[][], int range[][])
    {
        int sum=0;
        for(int i=range[0][0]; i<=range[0][1]; i++)
        {
            for(int j=range[1][0]; j<=range[1][1]; j++)
            {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Array :-");
        int arr[][] = make2DArray();
        System.out.println("Range :-");
        int range[][] = make2DArray();
        int sum = sumOf2DWithGivenRange(arr, range);
        System.out.println("The sum is " + sum);
    }
}
