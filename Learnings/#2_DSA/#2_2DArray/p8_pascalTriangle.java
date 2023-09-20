public class p8_pascalTriangle {
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

    static int[][] pascalTriangle(int n)
    {
        // for(int i=0; i<arr.length; i++)
        // {
        //     arr[i] = new int[i+1];
        // }

        // for(int i=0; i<arr.length; i++)
        // {
        //     for(int j=0; j<arr[i].length; j++)
        //     {
        //         if(j==0 || j==arr[i].length-1)
        //         {
        //             arr[i][j] = 1;
        //         }
        //         else if(i>=1 && j>=1 && j<arr[i].length-1)
        //         {
        //             arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
        //         }
        //     }
        // }
        int arr[][] = new int[n][];
        for(int i=0; i<n; i++) //optimized way
        {
            arr[i] = new int[i+1];
            arr[i][0] = arr[i][i] = 1;
            for(int j=1; j<i; j++)
            arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[][] = pascalTriangle(7);
        display2DArray(arr);
    }
}