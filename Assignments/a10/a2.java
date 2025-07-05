public class a2 {
    static int countOccurrences(int arr[], int x)
    {
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==x)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,0,7,8,3,0};
        System.out.println(countOccurrences(arr, 0));
    }
}
