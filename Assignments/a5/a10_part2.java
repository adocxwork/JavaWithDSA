import java.util.Scanner;

public class a10_part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :-");
        int n = sc.nextInt();
        System.out.println();

        for(int i=1; i*i<=n; i++)
        {
            System.out.println(i*i);
        }
    }
}
