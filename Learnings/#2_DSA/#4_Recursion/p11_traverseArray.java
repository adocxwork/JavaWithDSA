class p11_traverseArray
{
    static void recPrint(int arr[], int idx)
    {
        if(idx==arr.length) return;
        System.out.println(arr[idx]);
        recPrint(arr, idx+1);
    }
    public static void main(String[] args)
    {
        int arr[] = {5,6,7,8,9};
        recPrint(arr, 0);
    }
}