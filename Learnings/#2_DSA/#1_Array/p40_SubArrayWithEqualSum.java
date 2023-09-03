// check if we can partition the array into two subarrays with
// equal sum. More formally, check that the prefix sum of a
// part of the array is equal to the suffix sum of rest of the
// array.

public class p40_SubArrayWithEqualSum {
    static int totalSum(int arr[])
    {
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }
    static boolean subArraySum(int arr[])
    {
        int pref = 0, suff = 0, n=totalSum(arr);
        for(int i=0; i<arr.length; i++)
        {
            pref = pref + arr[i];
            suff = n-pref;
            if(pref == suff)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {5,3,2,6,3,1};
        // int arr[] = {1,2,3,4,5};
        System.out.println(subArraySum(arr));
    }
}
