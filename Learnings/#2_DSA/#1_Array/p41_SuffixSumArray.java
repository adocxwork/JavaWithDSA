public class p41_SuffixSumArray {
    static int[] makeSuffixSumArray(int arr[])
    {
        int n = arr.length;
        int suff[] = new int[n];
        suff[n-1] = arr[n-1];
        for(int i=(n-1-1); i>=0; i--)
        {
            suff[i] = suff[i+1] + arr[i];
        }
        return suff;
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
        int arr[] = {2,5,6,1,3};
        int ans[] = makeSuffixSumArray(arr);
        displayArray(arr);
        displayArray(ans);
    }
}
