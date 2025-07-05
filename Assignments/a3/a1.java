import java.util.Scanner;
class a1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :-");
        int x = sc.nextInt();

        x+=8;
        x/=3;
        x%=5;
        x*=5;

        System.out.println("Value of x : " + x);
    }
}