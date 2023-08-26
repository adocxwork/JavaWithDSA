public class p26_p10_reverseArray {
    static int[] reverseArray(int arr[])
    {
        int arr2[] = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--)
        {
            arr2[arr.length-i-1] = arr[i];
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
        int myarr[] = {3,9,1,7,0,4};
        displayArray(myarr);
        int ansArray[] = reverseArray(myarr);
        displayArray(ansArray);
    }
}
