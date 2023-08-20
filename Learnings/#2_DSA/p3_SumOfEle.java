// calculate the sum of all the elements
// in the given array
// arr[] = {1,5,3}
class ArrayClass{
    int arraySum(int arr[])
    {
        int sum = 0;
        for(int n : arr)
        {
            sum = sum + n;
        }
        return sum;
    }
}

public class p3_SumOfEle {
    public static void main(String[] args) {
        int arraryy[] = {1,5,3};
        ArrayClass obj = new ArrayClass();
        System.out.println(obj.arraySum(arraryy));
    }
}
