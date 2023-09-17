import java.util.Scanner;

public class a1{
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
    
    static int[] findIndex2DArray(int arr[][], int x)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                if(arr[i][j]==x)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
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
        Scanner scc = new Scanner(System.in);
        int arr[][] = make2DArray();
        System.out.println();
        display2DArray(arr);

        System.out.println("Enter the element you are searching for :-");
        int x = scc.nextInt();
        int indexx[] = findIndex2DArray(arr, x);

        if(indexx[0]==-1 && indexx[1]==-1)
        {
            System.out.println("Sorry, Entered element does not exits.");
        }
        else
        {
            display1DArray(indexx);
        }

    }
}