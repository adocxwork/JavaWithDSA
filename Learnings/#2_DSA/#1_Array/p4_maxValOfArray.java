// calculate the maximum value out
// of all the elements in the array
// arr[] = {1,5,3} >> 5
class ArrayThings{
    int maxVal(int arr[])
    {
        int tem=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>tem)
            {
                tem = arr[i];
            }
        }
        return tem;
    }
}


public class p4_maxValOfArray {
    public static void main(String[] args) {
        ArrayThings obj = new ArrayThings();
        int arrr[] = {9,1,5,3,7,11,5};
        System.out.println(obj.maxVal(arrr));
    }
}
