import java.util.Arrays;

public class a3 {
    static int missingNumber(int arr[])
    {
        int arr2[] = arr.clone();
        Arrays.sort(arr2);
        for(int i=0; i<arr2.length; i++)
        {
            if(arr2[i]!=(arr2[i+1]-1))
            {
                return ((arr2[i])+1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 3, 7, 8};
        // 1,2,3,4,6,7,8
        System.out.println(missingNumber(arr));
    }
}
