public class p20_p4 {
    static int largestElement(int arr[])
    {
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>ans)
            {
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {0,0,-2,-3,0,-4};
        int maxEle = largestElement(arr);
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==maxEle)
            {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        System.out.println(largestElement(arr));
    }
}
