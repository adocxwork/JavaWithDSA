// Rotate an array k times
public class p0_temp {
    static int[] rotateArray(int arr[], int k)
    {
        int n = arr.length;
        k = k%n;
        int arr2[] = new int[n];
        int j=0; //pointer for 2nd array
        for(int i=n-k; i<n; i++)
        {
            arr2[j++] = arr[i];
        }
        for(int i=0; i<n-k; i++)
        {
            arr2[j++] = arr[i];
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
        int arr[] = {3,5,0,1,4};
        displayArray(arr);
        int ans[] = rotateArray(arr, 51);
        displayArray(ans);
    }
}