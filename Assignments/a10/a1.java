public class a1{
    static boolean absoluteDifference(int arr[], int target)
    {
        int len = arr.length;
        for(int i=0; i<len; i++)
        {
            for(int j=i+1; j<len; j++)
            {
                if(arr[i]-arr[j]==target || arr[i]-arr[j]==-target)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // int arr[] = {5,10,15,20,26};
        // int target = 10;
        // System.out.println(absoluteDifference(arr, target));

        int arr[] = {1,2,3,4,5,6,7};
        int target = 0;
        System.out.println(absoluteDifference(arr, target));
    }
}