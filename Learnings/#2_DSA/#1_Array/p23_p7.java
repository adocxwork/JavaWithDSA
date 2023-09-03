// second smallest element of an array - just for practice
public class p23_p7 {
    static int SmallestElement(int arr[])
    {
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<ans)
            {
                ans = arr[i];
            }
        }

        return ans;

    }
    public static void main(String[] args) {
        int arr[] = {4,3,7,1,0,5,-7,-11};
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==SmallestElement(arr))
            {
                arr[i] = Integer.MAX_VALUE;
            }
        }
        System.out.println(SmallestElement(arr));
    }    
}
