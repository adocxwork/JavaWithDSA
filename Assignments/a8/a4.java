// Calculate the minimum element in the array
// {2, -3, 5, 8, 1, 0, -4} using standard library method
// for calculating the minimum element

public class a4 {
    public static void main(String[] args) {
        int arr[] = {2, -3, 5, 8, 1, 0, -4};
        int mmin = 0;
        for(int n : arr)
        {
            if(n<mmin)
            {
                mmin = n;
            }
        }
        System.out.println(mmin);
    }
}
