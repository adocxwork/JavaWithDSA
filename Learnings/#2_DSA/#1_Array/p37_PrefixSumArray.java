public class p37_PrefixSumArray {
    static void displayArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] PrefixSumArray(int arr[])
    {
        int pref[] = new int[arr.length];
        pref[0] = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,5};
        int pref[] = PrefixSumArray(arr);
        displayArray(arr);
        displayArray(pref);
    }
}
