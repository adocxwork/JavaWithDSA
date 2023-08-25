import java.util.Arrays;

public class p16_ex5 {
    static int Kth_smallest(int arr[], int k)
    {
        Arrays.sort(arr);
        return arr[k-1];
    }
    static int Kth_largest(int arr[], int k)
    {
        Arrays.sort(arr);
        return arr[(arr.length)-k];
    }
    public static void main(String[] args) {
        int arr[] = {5,6,4,8,9};
        System.out.println(Kth_smallest(arr,1)); //1st smallest element
        System.out.println(Kth_largest(arr,2)); //2nd largest element
    }
}
