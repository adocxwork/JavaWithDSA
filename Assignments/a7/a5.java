import java.util.Scanner;

public class a5 {
    int smallestCheck(int x, int y, int z)
    {
        if(x<y)
        {
            if(x<z)
            {
                return x;
            }
            else
            {
                return z;
            }
        }
        else if(y<x)
        {
            if(y<z)
            {
                return y;
            }
            else
            {
                return z;
            }
        }
        else if(x==y && y==z)
        {
            return x;
        }
        else
        {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers :-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        a5 obj = new a5();
        int ans = obj.smallestCheck(a, b, c);
        if(ans==-1)
        {
            System.out.println("Something went wrong..");
        }
        else
        {
            System.out.println("Smallest number : " + ans);
        }
        sc.close();
    }
}
