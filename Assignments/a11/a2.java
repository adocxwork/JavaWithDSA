// Given an array of positive and negative numbers, arrange them in an alternate fashion such that
// every positive number is followed by a negative and vice-versa maintaining the order of appearance.
// The number of positive and negative numbers need not be equal. Begin with a negative number.
// If there are more positive numbers, they appear at the end of the array. If there are more negative
// numbers, they too appear at the end of the array.

public class a2 {
    static int[] alternateLookForArray(int arr[])
    {
        int ans[] = new int[arr.length];
        int ansArrayIndex=0;

        int posPointer=0;
        int negPointer=0;
        String arrStatus = "n";

        whilePart: while(ansArrayIndex<=arr.length-1)
        {
            if(arrStatus=="n")
            {
                if(negPointer>=arr.length)
                {
                    arrStatus="pp";
                    break whilePart;
                }
                else if(arr[negPointer]>0)
                {
                    negPointer++;
                }
                else if(arr[negPointer]<0)
                {
                    ans[ansArrayIndex++] = arr[negPointer++];
                    if(negPointer==arr.length)
                    {
                        arrStatus="pp";
                        break whilePart;
                    }
                    else
                    {
                        arrStatus="p";
                    }
                }
            }
            if(arrStatus=="p")
            {
                if(posPointer>=arr.length)
                {
                    arrStatus="nn";
                    break whilePart;
                }
                else if(arr[posPointer]<0)
                {
                    posPointer++;
                }
                else if(arr[posPointer]>0)
                {
                    ans[ansArrayIndex++] = arr[posPointer++];
                    if(posPointer==arr.length)
                    {
                        arrStatus="nn";
                        break whilePart;
                    }
                    else
                    {
                        arrStatus="n";
                    }
                }
            }
        }
        if(arrStatus=="nn") //bacha hua negative number
        {
            for(int i=negPointer; i<arr.length; i++)
            {
                if(arr[i]<0)
                {
                    ans[ansArrayIndex++] = arr[i];
                }
            }
        }
        else if(arrStatus=="pp") //bacha hua positive number
        {
            for(int i=posPointer; i<arr.length; i++)
            {
                if(arr[i]>0)
                {
                    ans[ansArrayIndex++] = arr[i];
                }
            }
        }
        
        return ans;
    }

    static void displayArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // int arr[] = {1,2,3,-4,-1,4};
        int arr[] = {1,2,3,-4};
        displayArray(arr);
        int arr2[] = alternateLookForArray(arr);
        displayArray(arr2);
    }
}