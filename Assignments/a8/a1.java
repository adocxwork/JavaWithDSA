// Given an array of integers {2, 6, -5, -1, 0, 4, -9},
// print only the positive values present in the array.

class ArrayThings{
    void positiveElements(int arr[])
    {
        for(int n : arr)
        {
            if(n>=0)
            {
                System.out.print(n + " ");
            }
        }
    }
}

public class a1{
    public static void main(String[] args) {
        ArrayThings obj = new ArrayThings();
        int arr[] = {2, 6, -5, -1, 0, 4, -9};
        obj.positiveElements(arr);
    }
}