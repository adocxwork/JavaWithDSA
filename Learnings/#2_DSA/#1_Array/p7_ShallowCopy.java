import java.util.Scanner;

public class p7_ShallowCopy {
    static void displayArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter array's element :-");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        int arr_2[] = arr; //shallow copy
        // int arr_3[] = arr.clone(); //deep copy

        System.out.println("Original Array :-");
        displayArray(arr);
        System.out.println("Copied Array :-");
        displayArray(arr_2);
        
        arr_2[0] = 0;
        arr_2[1] = 0;

        System.out.println("Values after changing copied array :-");
        System.out.println();

        System.out.println("Original Array :-");
        displayArray(arr);
        System.out.println("Copied Array :-");
        displayArray(arr_2);

        sc.close();
    }
}
