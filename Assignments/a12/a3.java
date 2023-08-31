public class a3 {
    static int maximumWater(int arr[])
    {
        int water=0;
        int left=0, right=arr.length-1;
        while(left<right)
        {
            if(water<Math.min(arr[left], arr[right]) * (right-left))
            {
                water = Math.min(arr[left], arr[right]) * (right-left);
            }

            if(arr[left]<arr[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return water;
    }
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        // int arr[] = {1,1};
        System.out.println(maximumWater(arr));
    }
}
