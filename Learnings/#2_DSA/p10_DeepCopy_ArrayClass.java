import java.util.Arrays;

public class p10_DeepCopy_ArrayClass {

    static void displayArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8};

        // int arr2[] = Arrays.copyOf(arr, arr.length); //this will clone the whole array
        int arr2[] = Arrays.copyOf(arr, 2); //this will only copy first 2 elements
        int arr3[] = Arrays.copyOfRange(arr, 2, 4);
        
        System.out.println("Original Array :-");
        displayArray(arr);
        System.out.println("Cloned Array - copyOf :-");
        displayArray(arr2);

        System.out.println("Cloned Array - copyOfRange :-");
        displayArray(arr3);
        

    }
}
