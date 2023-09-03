// check if an array is sorted or not...?
public class p13_sorted {
    static boolean isSorted(int arr[])
    {
        boolean sortt = true;
        loop: for(int i=1; i<arr.length; i++)
        {
            if(arr[i-1]>arr[i])
            {
                sortt = false;
                break loop;
            }
        }
        return sortt;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,4,5,6,7,7,8};
        System.out.println(isSorted(arr));
    }
}
