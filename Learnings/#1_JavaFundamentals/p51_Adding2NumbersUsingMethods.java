import java.util.Scanner;

class Algebra{
    int add(int a, int b)
    {
        int ans = a+b;
        return ans;
    }
}

public class p51_Adding2NumbersUsingMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :-");
        int x = sc.nextInt();
        int y = sc.nextInt();

        Algebra obj = new Algebra();
        System.out.println(obj.add(x, y));
    }
}
