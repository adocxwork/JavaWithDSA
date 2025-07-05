import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks :-");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println("Total Marks : " + (n1+n2+n3));
        System.out.println("Percentage : " + (n1+n2+n3)/3);
    }
}
