// this is just for extra practice and revision
// hey there, i am aditya, and i know that i am the best..

public class temp {
    static int[][] matrixMultiplication(int arr1[][], int arr2[][])
    {
        int row = arr1.length, col = arr2[0].length;
        int ans[][] = new int[row][col];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                for(int k=0; k<arr2.length; k++)
                {
                    ans[i][j] = ans[i][j] + (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        return ans;
    }
    static int[][] transposeOfMatrix2(int arr[][])
    {
        int ans[][] = new int[arr[0].length][arr.length];
        for(int i=0; i<ans.length; i++)
        {
            for(int j=0; j<ans[0].length; j++)
            {
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }
    static void transposeOfMatrixInPlace2(int arr[][])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr[0].length; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    static void reverseRowsOfAMatrixInPlace(int arr[][])
    {
        for(int i=0; i<arr.length; i++)
        {
            reverse1DArray(arr[i]);
        }
    }
    static void reverse1DArray(int arr[])
    {
        int i=0, j=arr.length-1;
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotateAMatrixClockwise(int arr[][])
    {
        transposeOfMatrixInPlace2(arr);
        reverseRowsOfAMatrixInPlace(arr);
    }
    static int[][] pascalTriangle(int n)
    {
        int ans[][] = new int[n][];
        for(int i=0; i<n; i++)
        {
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] = 1;
            for(int j=1; j<i; j++)
            ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            // for(int j=0; j<ans[i].length; j++)
            // {
            //     if(j==0 || j==ans[i].length-1)
            //     ans[i][j] = 1;
            //     else
            //     ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            // }
        }
        return ans;
    }
    static void display2DArray2(int arr[][])
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
    static void reverseColumnsOf2DArray(int arr[][])
    {
        int i=0, j=arr.length-1;
        while(i<j)
        {
            int temp[] = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotate90dAntiClockwise2(int arr[][])
    {
        transposeOfMatrixInPlace2(arr);
        reverseColumnsOf2DArray(arr);
    }
    static boolean toeplitzC(int arr[][])
    {
        int ele = arr[0][0];
        for(int i=0, j=0; i<arr.length && j<arr[0].length; i++, j++)
        {
            if(arr[i][j] != ele)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        // display2DArray2(arr);

        // System.out.println();
        // rotate90dAntiClockwise2(arr);
        // display2DArray2(arr);

        int arr2[][] = {{1,2,3}, {2,1,4}, {4,7,2}};
        System.out.println(toeplitzC(arr2));
    }
}
