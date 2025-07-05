// Given an unsorted array arr[] of size N having both negative and positive integers, place
// all negative elements at the end of array without changing the order of positive elements
// and negative elements


public class a1{
    static void valueSeparation(int arr[])
    {
        // finding the number of -ve numbers in array
        int lenOfArray = arr.length;
        int negativeNum;
        int negativeNumFetched=0;

        int noOfNegativeNum=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<0)
            {
                noOfNegativeNum++;
            }
        }

        loop: for(int i=0; i<lenOfArray; i++)
        {
            if(arr[i]<0)
            {
                if(negativeNumFetched==noOfNegativeNum)
                {
                    break loop;
                }
                negativeNum = arr[i];
                for(int j=i; j<lenOfArray-1; j++)
                {
                    arr[j] = arr[j+1];
                }
                arr[lenOfArray-1] = negativeNum;
                negativeNumFetched++;
                i--;
            }
        }
    }

    static void disArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {-3,-1,0,-7};
        disArray(arr);
        valueSeparation(arr);
        disArray(arr);
    }
}