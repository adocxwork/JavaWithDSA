public class p2_SelectionSort {
    static void swap(int arr[], int i, int j)
    {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    static void displayArray(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void selectionSort(int arr[]) //sorts in increasing order
    {
        int n = arr.length;
        for(int i=0; i<n-1; i++)
        {
            int minIndex=i;
            for(int j=i+1; j<n;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,1,6,3,4};
        displayArray(arr);
        selectionSort(arr);
        displayArray(arr);
    }
}
