// given an integer m,n, and n integers, return true
// if the number of unique integers among the n
// integers is greater than or equal to m,
// else return false. (integers appearing multiple
// times are all aconsidered as 1 unique integer)

import java.util.Arrays;

public class a1{
    static boolean uniqueCountCheck(int arr[], int m)
    {
        int noOfUniqueNumbers = uniqueCount(arr);
        if(noOfUniqueNumbers>=m)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static int uniqueCount(int arr[])
    {
        int uniqueNumberCount = 0;
        Arrays.sort(arr);

        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i]!=arr[i+1])
            {
                uniqueNumberCount++;
            }
        }
        if(arr[arr.length-1]!=arr[arr.length-1-1])
        {
            uniqueNumberCount++;
        }

        return uniqueNumberCount;
    }
    public static void main(String[] args) {
        // int m = 5;
        // int arr[] = {1,2,1,4,5,2,1,1,2,2};
        int m = 9;
        int arr[] = {1,4,5,0,9,8,3,7,3,2,6,8,11,15,23};
        System.out.println(uniqueCountCheck(arr, m));
    }
}