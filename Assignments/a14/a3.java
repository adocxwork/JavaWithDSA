import java.util.Scanner;

public class a3 {
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

    static boolean toeplitzCheck(int arr[][])
    {
        int ele = arr[0][0];
        for(int i=1, j=1; i<arr.length && j<arr[0].length; i++, j++)
        {
            if(arr[i][j] != ele)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[][] = make2DArray();
        System.out.println();
        display2DArray(arr);

        System.out.println(toeplitzCheck(arr));
    }
}
