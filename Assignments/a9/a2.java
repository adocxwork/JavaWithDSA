// Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find 
//  union between these two arrays and print the number of elements of the union set.
//  Union of the two arrays can be defined as the set containing distinct elements from both 
//  the arrays. If there are repetitions, then only one occurrence of element should be printed 
//  in the union.
import java.util.Arrays;
import java.util.Scanner;

public class a2 {

    // displaying of array
    static void disArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    // Is element present?
    static boolean isElementPresentExceptSingleIndex(int arr[], int x, int exceptIndex)
    {
        boolean isPresent = false;
        loop1: for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == x && i!=exceptIndex)
            {
                isPresent = true;
                break loop1;
            }
        }
        return isPresent;
    }

    static boolean isElementPresent(int arr[], int x)
    {
        boolean isPresent = false;
        loop1: for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == x)
            {
                isPresent = true;
                break loop1;
            }
        }
        return isPresent;
    }

    static int countOccurrences(int arr[], int x)
    {
        int res = 0;
        for (int i=0; i<arr.length; i++)
            if (x == arr[i])
              res++;
        return res;
    }

    static int noOfUniqueElementsInArray(int arr[]) //returns the no of unique elements inside an array
    {
        int noOfUniqueElements=arr.length;
        for(int i=0; i<arr.length; i++)
        {
            if(isElementPresentExceptSingleIndex(arr, arr[i], i))
            {
                noOfUniqueElements=noOfUniqueElements-countOccurrences(arr, arr[i])+1;
            }
        }
        return noOfUniqueElements;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of a[] :-");
        int n = sc.nextInt();
        System.out.println("Enter the size of b[] :-");
        int m = sc.nextInt();

        int noOfElementsInUnionSet=0; //final answer
        int iA=0;
        int iB=0;

        if(m>=n)
        {
            // value input
            int a[] = new int[n];
            int b[] = new int[m];
            System.out.println("Enter the element of a[] :-");
            for(int i=0; i<a.length; i++)
            {
                a[i] = sc.nextInt();
            }
            System.out.println("Enter the element of b[] :-");
            for(int i=0; i<b.length; i++)
            {
                b[i] = sc.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            for(int i=0; i<a.length; i++)
            {
                if(a[iA]<b[iB])
                {
                    noOfElementsInUnionSet++;
                    iA++;
                }
                else if(a[iA]>b[iB])
                {
                    noOfElementsInUnionSet++;
                    iB++;
                }
                else if(a[iA]==b[iB])
                {
                    noOfElementsInUnionSet++;
                    iA++;
                    iB++;
                }
            }

            while(iB<b.length)
            {
                noOfElementsInUnionSet++;
                iB++;
            }

            // int a2[] = new int[noOfUniqueElementsInArray(a)];
            // int b2[] = new int[noOfUniqueElementsInArray(b)];
            // int indiOfA2=0;
            // int indiOfB2=0;

            // // unique value insertion
            // for(int i=0; i<a.length-1; i++)
            // {
            //     if(a[i]!=a[i+1])
            //     {
            //         a2[indiOfA2] = a[i];
            //         indiOfA2++;
            //     }
            // }
            // if(!isElementPresent(a2, a[a.length-1]))
            // {
            //     a2[indiOfA2] = a[a.length-1];
            //     indiOfA2++;
            // }

            // for(int i=0; i<b.length-1; i++)
            // {
            //     if(b[i]!=b[i+1])
            //     {
            //         b2[indiOfB2] = b[i];
            //         indiOfB2++;
            //     }
            // }
            // if(!isElementPresent(b2, b[b.length-1]))
            // {
            //     b2[indiOfB2] = b[b.length-1];
            //     indiOfB2++;
            // }


            // // final answer calculation
            // noOfElementsInUnionSet = noOfElementsInUnionSet + b2.length + a2.length;
            // for(int i=0; i<a2.length; i++)
            // {
            //     if(isElementPresent(b2, a2[i]))
            //     {
            //         noOfElementsInUnionSet--;
            //     }
            // }



            System.out.println("Final Answer : " + noOfElementsInUnionSet);
        }
        else
        {
            System.out.println("Invalid value for n & m..");
        }
        sc.close();
    }
}
