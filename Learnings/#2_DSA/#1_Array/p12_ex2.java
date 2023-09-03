// import java.util.Scanner;

public class p12_ex2 {
    static int elementGreater(int arr[], int x)
    {
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>x)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {7,6,3,8,9};
        int x = 7;
        System.out.println(elementGreater(arr, x));
    }
}
