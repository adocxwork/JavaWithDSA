import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class a4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of inputs :-");
        int n = sc.nextInt();

        ArrayList<Integer> l = new ArrayList<Integer>();
        int k;
        System.out.println("Enter the numbers :-");
        for(int i=0; i<n; i++)
        {
            k = sc.nextInt();
            l.add(k);
        }

        System.out.println();
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
    }
}
