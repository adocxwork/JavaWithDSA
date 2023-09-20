import java.util.Scanner;

public class a2 {
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
    static void transposeOfMatrix(int arr[][])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr[i].length; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    static void reverseColumnsOfArray(int arr[][])
    {
        int i=0, j=arr.length-1;
        while(i<j)
        {
            int temp[] = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
    }
    static void rotate90dAntiClockwise(int arr[][])
    {
        transposeOfMatrix(arr);
        reverseColumnsOfArray(arr);
    }
    public static void main(String[] args) {
        int arr[][] = make2DArray();
        System.out.println();
        display2DArray(arr);
        
        rotate90dAntiClockwise(arr);
        System.out.println();
        display2DArray(arr);        
    }
}
