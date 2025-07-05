import java.util.Scanner;

public class a10 {
    public static void main(String[] args) {
        // n no of bulbs >> off
        // circuit hitting n times
        // 1st >> all
        // 2nd >> every 2nd.......
        // which one will be on?
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :-");
        int n = sc.nextInt();
        System.out.println();

        int arr[] = new int[n];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j=j+(1+i))
            {
                arr[j] = arr[j] + 1;
            }
        }

        for(int k=0; k<n; k++)
        {
            if(arr[k]%2!=0)
            {
                System.out.println(k);
            }
        }
    }
}
