public class p25_sumOfSubset {
    static void printSum(int arr[], int currSum, int idx)
    {
        if(idx==arr.length)
        {
            System.out.println(currSum);
            return;
        }
        int addedSum = currSum + arr[idx];
        printSum(arr, currSum, idx+1);
        printSum(arr, addedSum, idx+1);
    }
    static void sumSubset(int a[], int n, int idx, int sum)
    {
        if(idx>=n)
        {
            System.out.println(sum);
            return;
        }
        sumSubset(a, n, idx+1, sum);
        sumSubset(a, n, idx+1, sum + a[idx]);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5};
        sumSubset(arr, arr.length, 0, 0);
    }
}
