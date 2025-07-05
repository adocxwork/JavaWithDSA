public class p4_question {
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
    static void zeroEnd(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n-1; i++)
        {
            boolean flag=false;
            for(int j=0; j<n-1-i; j++)
            {
                if(arr[j]==0 && arr[j+1]!=0)
                {
                    swap(arr, j, j+1);
                    flag=true;
                }
            }
            if(flag==false) return;
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,5,0,3,4,2};
        displayArray(arr);
        zeroEnd(arr);
        displayArray(arr);
    }
}
