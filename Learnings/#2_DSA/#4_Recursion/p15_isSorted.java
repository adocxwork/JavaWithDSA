public class p15_isSorted {
    static void bubbleSort(int arr[])
    {
        int n=arr.length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }
    static void dis(int arr[])
    {
        int n=arr.length;
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static boolean isSorted(int arr[], int n, int idx)
    {
        if(idx==n-1) return true;
        if(arr[idx] > arr[idx+1]) return false;
        return isSorted(arr, n, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {7,1,6,2,5,0,9};
        dis(arr);
        System.out.println(isSorted(arr, arr.length, 0));
        bubbleSort(arr);
        System.out.println(isSorted(arr, arr.length, 0));
        dis(arr);
    }
}
