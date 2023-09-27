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
    static int[][] prefixSumRowAndColWise(int arr[][])
    {
        int arr2[][] = arr.clone();
        for(int i=0; i<arr2.length; i++)
        {
            for(int j=1; j<arr2[i].length; j++)
            {
                arr2[i][j] += arr2[i][j-1];
            }
            for(int j=0; j<arr2[i].length && i>0; j++)
            {
                arr2[i][j] += arr2[i-1][j];
            }
        }
        return arr2;
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

    static int sumOfRectanglePrefixSumMethod(int arr[][], int l1, int r1, int l2, int r2)
    {
        if(l2<l1 || r2<r1 || l1>=arr.length ||
        l2>=arr.length || r1>=arr[0].length || r2>=arr[0].length)
        {
            return -1;
        }
        // finding prefix sum row wise...
        int arr2[][] = arr.clone();
        for(int i=0; i<arr2.length; i++)
        {
            for(int j=1; j<arr2[i].length; j++)
            {
                arr2[i][j] += arr2[i][j-1];
            }
        }
        // calculating sum
        int sum=0;
        for(int i=l1; i<=l2; i++)
        {
            if(r1==0)
            sum += arr2[i][r2];
            else
            sum += (arr2[i][r2] - arr2[i][r1-1]);
        }
        return sum;
    }

    static int sumOfRectangleUltimatePrefixSumMethod(int arr[][], int l1, int r1, int l2, int r2)
    {
        if(l2<l1 || r2<r1 || l1>=arr.length ||
        l2>=arr.length || r1>=arr[0].length || r2>=arr[0].length)
        {
            return -1;
        }
        // finding prefix sum row & column wise
        int arr2[][] = prefixSumRowAndColWise(arr);
        // calculation
        int sum=0;
        if(l1>0 && r1>0)
        sum = arr2[l2][r2] - arr2[l1-1][r2] - arr2[l2][r1-1] + arr2[l1-1][r1-1];
        else if(l1==0 && r1==0)
        sum = arr2[l2][r2];
        else if(l1==0)
        sum = arr2[l2][r2] - arr2[l2][r1-1];
        else if(r1==0)
        sum = arr2[l2][r2] - arr2[l1-1][r2];

        return sum;
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,7},
            {4,5,6,2},
            {7,8,9,4}
        };
        display2DArray(arr);
        System.out.println();

        // System.out.println(sumOfRectangleBruteForce(arr, 0,1,1,3));
        // System.out.println(sumOfRectanglePrefixSumMethod(arr, 0,1,1,3));
        System.out.println(sumOfRectangleUltimatePrefixSumMethod(arr, 1,0,2,1));

        System.out.println();
        display2DArray(arr);
    }
}
