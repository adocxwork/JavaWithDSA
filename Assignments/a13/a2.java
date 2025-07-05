public class a2 {
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
    static void display1DArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[][] oneD2twoDArray(int arr[], int n, int m)
    {
        int ans[][] = new int[n][m];
        int k=0;
        for(int i=0; i<ans.length; i++)
        {
            for(int j=0; j<ans[i].length; j++)
            {
                ans[i][j] = arr[k++];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=2, m=3;
        int arr[] = {1,2,3,4,5,7};
        int arr2[][] = oneD2twoDArray(arr, n, m);
        display2DArray(arr2);
    }
}