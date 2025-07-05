import java.util.Scanner;

class a1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :-");
        int n = sc.nextInt();
        System.out.println();

        int o1 = 0;
        int o2 = 1;
        int o3 = 0;
        for(int i=0; i<=n; i++)
        {
            if(i==0)
            {
                System.out.print(o1 + " ");
            }
            else if(i==1)
            {
                System.out.print(o2 + " ");
            }
            else
            {
                o3 = o1+o2;
                System.out.print(o3 + " ");
                o1=o2;
                o2=o3;
            }
        }
    }
}