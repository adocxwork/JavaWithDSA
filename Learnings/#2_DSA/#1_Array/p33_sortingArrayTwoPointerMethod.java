public class p33_sortingArrayTwoPointerMethod {
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
    static void twoPointerSort(int arr[])
    {
        int left=0, right=arr.length-1;
        while(left<right)
        {
            if(arr[left]==1 && arr[right]==0)
            {
                swapArrayElements(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]==0)
            {
                left++;
            }
            if(arr[right]==1)
            {
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,0,1,1};
        displayArray(arr);
        twoPointerSort(arr);
        displayArray(arr);
    }
}
