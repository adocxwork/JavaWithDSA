public class p3_InsertionSort {
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
    static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]) {
                swap(arr, j-1, j);
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,1,8,2,7,3,6};
        displayArray(arr);
        insertionSort(arr);
        displayArray(arr);
    }
}
































        // static void insertionSort(int arr[])
        // {
        //     int n = arr.length;
        //     for(int i=1; i<n; i++)
        //     {
        //         int j=i;
        //         while(j>0 && arr[j]<arr[j-1])
        //         {
        //             swap(arr, j, j-1);
        //             j--;
        //         }
        //     }
        // }