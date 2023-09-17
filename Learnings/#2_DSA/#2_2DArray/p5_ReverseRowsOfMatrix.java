import java.util.Scanner;

public class p5_ReverseRowsOfMatrix {
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
    public static void main(String[] args) {
        int arr[][] = make2DArray();
        System.out.println();
        display2DArray(arr);
        System.out.println();
        reverseRowOf2DArray(arr);
        System.out.println("Array with Reversed Rows :-");
        display2DArray(arr);
    }
}
