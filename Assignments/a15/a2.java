public class a2 {
    static boolean perfectMatrixCheck(int arr[][])
    {
        int r = arr.length, c = arr[0].length;
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if((i==j) || ((i+j)==(r-1))) //diagonals
                {
                    if(arr[i][j]==0)
                    return false;
                }
                else //non diagonals
                {
                    if(arr[i][j]!=0)
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,0,0,1},
            {0,2,1,0},
            {0,1,2,0},
            {1,0,0,1}
        };
        System.out.println(perfectMatrixCheck(arr));
    }
}
