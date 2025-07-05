public class p22_p6 {

    static int lastRepeatingElement(int arr[])
    {
        for(int i=arr.length-1; i>=0; i--)
        {
            for(int j=arr.length-2; j>=0; j--)
            {
                if(arr[i]==arr[j])
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,6,3,4,6};
        System.out.println(lastRepeatingElement(arr));
    }
}
