import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Addition you want to perform :-");
        int n = sc.nextInt();

        System.out.println("Enter the numbers for addition :-");
        for(int i=0; i<n; i++)
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println("Sum : "+(n1+n2));
        }
    }
}
