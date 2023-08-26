public class p27_reverseArrayInPlace {
    static void reverseArrayInPlace(int arr[])
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            i++;
            j--;
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
        int arr[] = {1,4,2,7,9};
        displayArray(arr);
        reverseArrayInPlace(arr);
        displayArray(arr);
    }
}
