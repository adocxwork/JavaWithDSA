//  Write a Java method to display the middle character of a string.(Easy)
// Note: a) If the length of the string is even there will be two middle characters.
// b) If the length of the string is odd there will be one middle character.

import java.util.Scanner;

public class a3 {
    void displayMiddleChar(String val)
    {
        int len = val.length();
        if(len%2==0)
        {
            System.out.print(val.charAt((len/2)-1));
            System.out.print(val.charAt((len/2)));
        }
        else
        {
            System.out.print(val.charAt((len/2)));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :-");
        String val = sc.nextLine();

        a3 obj = new a3();
        System.out.println("Middle Characters :-");
        obj.displayMiddleChar(val);
        sc.close();
    }
}
