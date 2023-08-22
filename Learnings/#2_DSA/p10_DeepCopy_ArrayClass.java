import java.util.Arrays;

public class p10_DeepCopy_ArrayClass {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8};
        // int arr2[] = Arrays.copyOf(arr, 2);
        int arr2[] = Arrays.copyOf(arr, arr.length);

        arr2[0] = 0; //this is a separate copy

        for(int i=0; i<arr2.length; i++)
        {
            System.out.print(arr2[i] + " ");
        }
    }
}
