// return a sorted square array
public class p36_squareArrayTwoPointerProblem {
    static void displayArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] sortedSquareArray(int arr[])
    {
        int ans[] = new int[arr.length];
        int ansArrayIndex=arr.length-1;
        
        int left=0, right=arr.length-1;
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
    public static void main(String[] args) {
        int arr[] = {-10,-7,-3,1,2,4,8};
        int ans[] = sortedSquareArray(arr);
        displayArray(arr);
        displayArray(ans);
    }
}
