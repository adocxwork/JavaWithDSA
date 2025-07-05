// given an integer array arr, return the number of consecutive
// sequences(subarrays) with odd sum.
public class a2 {
    static int consecutiveSum(int arr[], int a, int b)
    {
        int sum=0;
        for(int i=a; i<=b; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }
    static int subarraysWithOddSum(int arr[])
    {
        int noOfSumArraysWithOddSum=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2!=0)
            {
                noOfSumArraysWithOddSum++;
            }
            for(int j=i+1; j<arr.length; j++)
            {
                if(consecutiveSum(arr, i, j)%2!=0)
                {
                    noOfSumArraysWithOddSum++;
                }
            }
        }
        return noOfSumArraysWithOddSum;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5};
        System.out.println(subarraysWithOddSum(arr));
    }
}
