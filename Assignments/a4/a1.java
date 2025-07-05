import java.util.Scanner;

class a1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length :-");
        int l = sc.nextInt();
        System.out.println("Enter Breadth :-");
        int b = sc.nextInt();
        if(l==b)
        {
            System.out.println("It's a Square..");
        }
        else
        {
            System.out.println("It's not a Square..");
        }
    }
}