import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            String a = sc.next();
            String b = sc.next();
            System.out.println(a+b);

            System.out.println("Exit? (y/n) :-");
            char loo = sc.next().charAt(0);
            if(loo == 'y')
            {
                break;
            }
        }
    }
}

// import java.util.Scanner;
// public class a5 {
// public static void main(String[] args) {

// Scanner scn = new Scanner(System.in);
// while(scn.hasNextLine()){ //still doesn't works..
// String a = scn.next();
// String b = scn.next();
// System.out.println(a+b);
// }


// }
// }