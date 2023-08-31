public class a4 {
    static void targetPairSum(int arr[], int target)
    {
        outer: for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    System.out.print((i+1) + " " + (j+1));
                    break outer;
                }
            }
        }
    }
    public static void main(String[] args) {
        // int arr[] = {2,7,11,15};
        int arr[] = {-1,0};
        targetPairSum(arr, -1);
    }
}
