public class p28_RotateArray {
    static int[] arrayRotation(int arr[], int k)
    {
        int n = arr.length;
        k = k%n;
        int arr2[] = new int[n];
        int l=0;
        for(int i=n-k; i<n; i++)
        {
            arr2[l++] = arr[i];
        }
        for(int i=0; i<n-k; i++)
        {
            arr2[l++] = arr[i];
        }
        return arr2;
    }

    static void displayArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 102;
        displayArray(arr);
        int ans[] = arrayRotation(arr, k);
        displayArray(ans);

    }
}
