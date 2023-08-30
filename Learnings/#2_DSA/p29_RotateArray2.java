// rotate the given array 'a' by k steps,
// where k is non negative, without using
// extra space. >> InPlace kaam karna hai

public class p29_RotateArray2 {
    static void rotateWithoutExtraArray(int arr[], int k)
    {
        int n = arr.length;
        k = k%n;
        int rotatingVar=0;
        for(int i=0; i<k; i++) //k times chalega
        {
            rotatingVar = arr[arr.length-1];
            for(int j=arr.length-1; j>0; j--)
            {
                arr[j] = arr[j-1];
            }
            arr[0] = rotatingVar;
        }
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
        int arr[] = {9,2,7,4,0,1};
        displayArray(arr);
        rotateWithoutExtraArray(arr, 2);
        displayArray(arr);
    }
}
