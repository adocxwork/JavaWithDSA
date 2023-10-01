public class a3 {
    static void upper(int arr[][])
    {
        for(int i=0; i<(arr.length); i++)
        {
            for(int k=0; k<i; k++)
            {
                System.out.print("  ");
            }
            for(int j=i; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,1,2,3},
            {3,4,5,6}
        };
        upper(arr);
    }
}