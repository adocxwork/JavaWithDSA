public class p1_Initialization_Printing{
    static void print2DArray(int arr[][])
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
    public static void main(String[] args) {
        int arr[][] = new int[2][2];
        arr[0][0] = 2;
        arr[0][1] = 3;
        arr[1][0] = 0;
        arr[1][1] = 7;
        int arr2[][] = {
                        {4,5,6},
                        {2,3,1},
                        {8,9,0}
                        };
        print2DArray(arr);
        print2DArray(arr2);
    }
}