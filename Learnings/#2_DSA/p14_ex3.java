public class p14_ex3 {
    static int[] smallestLargest(int arr[])
    {
        int smallest = arr[0];
        int biggest = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<=smallest)
            {
                smallest = arr[i];
            }
            if(arr[i]>=biggest)
            {
                biggest = arr[i];
            }
        }
        int arr2[] = {smallest, biggest};
        return arr2;
    }
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,4,1,9};
        int ansArray[] = smallestLargest(arr);

        for(int i=0; i<ansArray.length; i++)
        {
            System.out.print(ansArray[i] + " ");
        }
    }
}
