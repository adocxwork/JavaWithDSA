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
        int r = arr.length, c = arr[0].length, i=0, j=0;
        int ans[] = new int[(r*c)];
        for(int k=0; k<ans.length; k++)
        {
            ans[k] = arr[i][j];
            if(i==0 && j==c-1)
            {
                i=r-1;
                j=1;
            }
            else if(j==c-1)
            {
                int temp = i;
                i = j;
                j = temp;
                j++;
            }
            else if(i==0)
            {
                i=j+1;
                j=0;
            }
            else
            {
                i--;
                j++;
            }
        }
        return ans;
    }
    static void display1DArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[][] = make2DArray();
        display2DArray(arr);
        System.out.println();

        int arr2[] = diagonalElementsOfMatrix(arr);
        display1DArray(arr2);
    }
}
