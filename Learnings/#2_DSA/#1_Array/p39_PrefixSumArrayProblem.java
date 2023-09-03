public class p39_PrefixSumArrayProblem {
    static int sumOfArrayBetweenIndices(int arr[], int l, int r)
    {
        int sum=0;

        // making prefix array
        int pref[] = new int[arr.length+1];
        pref[1] = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            pref[i+1] = pref[i] + arr[i];
        }

        sum = pref[r] - pref[l-1];
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,6,5};
        // int l=3, r=5;
        // int l=1, r=5;
        // int l=2, r=6;
        // int l=3, r=4;
        int l=5, r=5;
        System.out.println(sumOfArrayBetweenIndices(arr, l, r));
    }
}
