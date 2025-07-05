public class a1{
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
    static int[][] prefixSumMatrix(int arr[][])
    {
        int ans[][] = arr.clone();
        for(int i=0; i<ans.length; i++)
        {
            for(int j=1; j<ans[i].length; j++)
            {
                ans[i][j] += ans[i][j-1];
            }
            for(int j=0; j<ans[i].length && i>0; j++)
            {
                ans[i][j] += ans[i-1][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // int arr1[][] = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        int arr1[][] = {
            {1,0,1},
            {0,1,0}
        };
        int arr2[][] = prefixSumMatrix(arr1);
        display2DArray(arr2);
    }
}