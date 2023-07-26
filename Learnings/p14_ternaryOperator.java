import java.util.Scanner;

public class p14_ternaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String res = (n%3==0 && n%5!=0)? "Fizz":((n%5==0 && n%3!=0)? "Buzz":((n%3==0 && n%5==0)? "FizzBuzz":"NotFound" ) ) ;
        if(res!="NotFound")
        {
            System.out.println(res);
        }
        else
        {
            System.out.println(n);
        }
    }
}
