public class p21_p5 {
    static int firstRepeatingElement(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
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
        int arr[] = {1,5,3,4,6,3,4};
        // int arr[] = {1,5,3};
        System.out.println(firstRepeatingElement(arr));
    }
}
