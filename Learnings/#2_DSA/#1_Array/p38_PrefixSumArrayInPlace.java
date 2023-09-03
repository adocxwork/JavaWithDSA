public class p38_PrefixSumArrayInPlace {
    static void displayArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void PrefixSumArray(int arr[])
    {
        for(int i=1; i<arr.length; i++)
        {
            arr[i] = arr[i-1] + arr[i]; //in place
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,5};
        displayArray(arr);
        PrefixSumArray(arr);
        displayArray(arr);
    }
}
