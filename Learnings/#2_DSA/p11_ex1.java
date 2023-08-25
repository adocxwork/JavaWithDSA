// wap to find the no of times, an element is present in an array

import java.util.Scanner;

public class p11_ex1 {
    static int elementCount(int arr[], int ele)
    {
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==ele)
            {
                count++;
            }
        }
        return count;
    }
    static int lastOccurence(int arr[], int x)
    {
        int index = -1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == x)
            {
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array
        System.out.println("Enter the size of Array :-");
        int size =  sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of Array :-");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        // element
        System.out.println("Enter the element :-");
        int c = sc.nextInt();
        System.out.println("The element's last index is :-");
        System.out.println(lastOccurence(arr, c));

        // System.out.println("The element count is :-");
        // System.out.println(elementCount(arr, c));


        sc.close();
    }
}
