import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Cost Price :-");
        int cp = sc.nextInt();
        System.out.println("Enter Selling Price :-");
        int sp = sc.nextInt();

        if(sp>cp)
        {
            System.out.println("Profit : " + (sp-cp));
        }
        else
        {
            System.out.println("Loss : " + (cp-sp));
        }
    }
}
