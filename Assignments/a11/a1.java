public class a1{
    static int repeatingElementIndex(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    return i+1; //assuming 1 based indexing
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,3,5,6};
        System.out.println(repeatingElementIndex(arr));
        int arr2[] = {2,5,3,4};
        System.out.println(repeatingElementIndex(arr2));
    }
}