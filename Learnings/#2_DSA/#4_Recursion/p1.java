import java.util.Scanner;

public class p1{
    static void printIncreasing(int n) //1-->n >> 1 2 3 4 5
    {
        if(n==1) //base case
        {
            System.out.println(1);
            return;
        }
        printIncreasing(n-1); //recursive work
        System.out.println(n); //self work
    }

    static void printDecreasing(int n) //n-->1 >> 5 4 3 2 1
    {
        if(n==1) //base case
        {
            System.out.println(1);
            return;
        }
        System.out.println(n); //self work
        printDecreasing(n-1); //recursive work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :-");
        int n = sc.nextInt();

        // printIncreasing(n);
        printDecreasing(n);
    }
}