import java.util.Scanner;

class a1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name :-");
        String name = sc.nextLine();
        System.out.println("Enter Roll No :-");
        int rollNo = sc.nextInt();
        System.out.println("Enter Field of Interest :-");
        String interest = sc.nextLine();

        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Field of Interest : " + interest);
    }
}