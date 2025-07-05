// bring all the even integers at the beginning, followed by odd integers, order doesn't matters

public class p34_sortingArrayTwoPointerMethod {
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
    static void sortingArrayTwoPointerMethod(int arr[])
    {
        int left=0, right = arr.length-1;
        while(left<right)
        {
            if(arr[left]%2!=0 && arr[right]%2==0)
            {
                swapArrayElements(arr, left, right);
            }
            if(arr[left]%2==0)
            {
                left++;
            }
            if(arr[right]%2!=0)
            {
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,8};
        displayArray(arr);
        sortingArrayTwoPointerMethod(arr);
        displayArray(arr);
    }
}
