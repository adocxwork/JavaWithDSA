import java.util.Scanner;

public class a4 {
    boolean leapCheck(int num)
    {
        boolean ans;
        if(num%4==0)
        {
            ans=true;
        }
        else
        {
            ans=false;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year number :-");
        int yr =  sc.nextInt();

        a4 obj = new a4();
        System.out.println(obj.leapCheck(yr));

        sc.close();
    }
}
