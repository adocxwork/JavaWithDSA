public class p1_BubbleSort
{
    static void swap(int arr[], int i, int j)
    {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(arr, j, j+1);
                }
            }
        }
    }
    static void bubbleSort2(int arr[]) //optimized sort
    {
        int n = arr.length;
        for(int i=0; i<n-1; i++)
        {
            boolean flag=false;
            for(int j=0; j<n-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(arr, j, j+1);
                    flag=true;
                }
            }
            if(flag==false) return;
        }
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
    public static void main(String[] args) {
        int arr[] = {7,3,1,5,4};
        displayArray(arr);
        bubbleSort2(arr);
        displayArray(arr);
    }
}