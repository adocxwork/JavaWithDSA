import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an operator (+-/*%) :-");
        String sym = sc.next();
        
        System.out.println("Enter two numbers :-");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println();

        switch(sym)
        {
            default: System.out.println("Invalid Operator...");
            break;
            case "+": System.out.println(n1+n2);
            break;
            case "-": System.out.println(n1-n2);
            break;
            case "/": System.out.println(n1/n2);
            break;
            case "*": System.out.println(n1*n2);
            break;
            case "%": System.out.println(n1%n2);
            break;
        }
    }
}
