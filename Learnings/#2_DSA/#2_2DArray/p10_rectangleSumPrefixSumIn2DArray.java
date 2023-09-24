import java.util.Scanner;

public class p10_rectangleSumPrefixSumIn2DArray {
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
    static int sumOfRectangleBruteForce(int arr[][], int l1, int r1, int l2, int r2)
    {
        if(l2<l1 || r2<r1 || l1>=arr.length ||
        l2>=arr.length || r1>=arr[0].length || r2>=arr[0].length)
        {
            return -1;
        }
        int sum = 0;
        for(int i=l1; i<=l2; i++)
        {
            for(int j=r1; j<=r2; j++)
            {
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][] = make2DArray();
        System.out.println();
        display2DArray(arr);

        System.out.println();
        System.out.println(sumOfRectangleBruteForce(arr, 1, 1, 2, 2));
    }
}
