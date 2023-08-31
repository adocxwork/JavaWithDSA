public class a5 {
    static int[] sortedSquaresOfArrayElements(int arr[])
    {
        int ans[] = new int[arr.length];
        int left=0, right=arr.length-1;
        int ansArrayIndex=arr.length-1;
        while(left<=right)
        {
            if(arr[left]*arr[left]>arr[right]*arr[right])
            {
                ans[ansArrayIndex--] = arr[left]*arr[left];
                left++;
            }
            else
            {
                ans[ansArrayIndex--] = arr[right]*arr[right];
                right--;
            }
        }
        return ans;
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
        // int arr[] = {-5,-2,-1,0,4,6};
        int arr[] = {2,1,0,4,6};
        int ans[] = sortedSquaresOfArrayElements(arr);
        displayArray(arr);
        displayArray(ans);
    }
}
