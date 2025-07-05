// given an integer array "a" sorted in non decreasing order,
// return an array of the squares of each number sorted in non decreasing order.


public class p35_twoPointerProblem {
    static void displayArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swapArrayElements(int arr[], int i, int j)
    {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    static void reverseArray(int arr[])
    {
        int left=0, right=arr.length-1;
        while(left<right)
        {
            swapArrayElements(arr, left, right);
            left++;
            right--;
        }
    }
    static int[] returningSquaresOfElementsInNonDecreasingOrder(int arr[])
    {
        int ans[] = new int[arr.length];
        int left=0, right=arr.length-1;
        int ansArrayIndex=0;
        while(left<=right)
        {
            if(arr[left]*arr[left] > arr[right]*arr[right])
            {
                ans[ansArrayIndex++] = arr[left]*arr[left];
                left++;
            }
            if(arr[left]*arr[left] < arr[right]*arr[right])
            {
                ans[ansArrayIndex++] = arr[right]*arr[right];
                right--;
            }
            if(left==right)
            {
                ans[ansArrayIndex++] = arr[left]*arr[left];
                left++;
            }
        }
        reverseArray(ans);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {-10,-2,1,20};
        int ans[] = returningSquaresOfElementsInNonDecreasingOrder(arr);
        displayArray(arr);
        displayArray(ans);
    }
}
