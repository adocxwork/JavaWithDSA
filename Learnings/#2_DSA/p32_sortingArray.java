public class p32_sortingArray {
    static void sortArray(int arr[])
    {
        int zeroCount=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==0)
            {
                zeroCount++;
            }
        }
        for(int i=0; i<arr.length; i++)
        {
            if(i<zeroCount)
            {
                arr[i]=0;
            }
            else
            {
                arr[i]=1;
            }
        }
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
        int arr[] = {0,1,1,0,1,0,1,0,0};
        displayArray(arr);
        sortArray(arr);
        displayArray(arr);
    }
}
