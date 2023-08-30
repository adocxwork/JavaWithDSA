public class p30_RotateArray3 {
    static void reverseArray(int arr[], int firstIndex, int lastIndex)
    {
        int i=firstIndex;
        int j=lastIndex;
        while(i<j)
        {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            i++;
            j--;
        }
    }
    // rotate array in place
    static void rotateWithoutExtraArray3(int arr[], int k)
    {
        int n = arr.length;
        k = k%n;
        reverseArray(arr, 0, n-k-1);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-1);
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
        int arr[] = {2,9,3,6,0,7,1};
        displayArray(arr);
        rotateWithoutExtraArray3(arr, 3);
        displayArray(arr);
    }
}
