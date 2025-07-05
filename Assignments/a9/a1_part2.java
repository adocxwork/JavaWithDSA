public class a1_part2 {
    static void disArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,-1,0,-7,4,7,9,-2};
        int arr2[] = new int[arr.length];
        int ind = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>=0)
            {
                arr2[ind] = arr[i];
                ind++;
            }
        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<0)
            {
                arr2[ind] = arr[i];
                ind++;
            }
        }

        disArray(arr);
        disArray(arr2);
    }
}
