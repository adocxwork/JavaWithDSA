import java.util.Scanner;

public class p7_rotate2DArray {
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
    static void reverse1DArray(int arr[])
    {
        int left=0, right = arr.length-1;
        while(left<right)
        {
            arr[left] = arr[left] + arr[right];
            arr[right] = arr[left] - arr[right];
            arr[left] = arr[left] - arr[right];
            left++;
            right--;
        }
    }
    static void reverseRowOf2DArray(int arr[][])
    {
        for(int i=0; i<arr.length; i++)
        {
            reverse1DArray(arr[i]);
        }
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
    static void rotateClockWise2DArray(int arr[][])
    {
        transposeOfMatrixInPlace(arr);
        reverseRowOf2DArray(arr);
    }
    public static void main(String[] args) {
        int arr[][] = make2DArray();
        System.out.println();
        display2DArray(arr);
        
        System.out.println();
        System.out.println("Rotated Array :-");
        rotateClockWise2DArray(arr);
        display2DArray(arr);
    }
}