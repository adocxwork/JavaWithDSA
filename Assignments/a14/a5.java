import java.util.Scanner;

public class a5 {
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
    // number of non overlapping range, inside 2D array, range will be
    // given, we need to calculate number of non overlapping range
    static int nonOverlappingRange(int arr[][])
    {
        int count=1, start = arr[0][0], end = arr[0][1];
        for(int i=1; i<arr.length; i++)
        {
            if((start<=arr[i][0] && end>=arr[i][0]) ||
            (start<=arr[i][1] && end>=arr[i][1]))
            {
                if(start<arr[i][0])
                start = arr[i][0];
                if(end<arr[i][1])
                end = arr[i][1];
            }
            else
            {
                start = arr[i][0];
                end = arr[i][1];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][] = make2DArray();
        System.out.println();
        display2DArray(arr);

        System.out.println();
        System.out.println("Non overlapping intervals :-");
        System.out.println(nonOverlappingRange(arr));
    }
}
