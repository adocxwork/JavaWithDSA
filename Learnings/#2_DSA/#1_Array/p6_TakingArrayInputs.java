import java.util.Scanner;

public class p6_TakingArrayInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :-");
        int n = sc.nextInt();

        // Array declaration
        int arr[] = new int[n];

        // Values inputs
        System.out.println("Enter the values of elements :-");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        // Printing Array
        System.out.println("The Array is :-");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
