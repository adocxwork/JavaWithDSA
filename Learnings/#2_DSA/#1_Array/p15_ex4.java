import java.util.Arrays;

public class p15_ex4 {
    static int[] smallestLargest(int arr[])
    {
        Arrays.sort(arr);
        int arr2[] = {arr[0], arr[arr.length-1]};
        return arr2;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,5,7,1};
        int valArr[] = smallestLargest(arr);
        System.out.println(valArr[0]);
        System.out.println(valArr[1]);
    }
}
