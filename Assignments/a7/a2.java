//  Write a Java method to count all vowels in a string

import java.util.Scanner;

public class a2 {
    int vowelCount(String val)
    {
        int len = val.length();
        int ans=0;
        for(int i=0; i<len; i++)
        {
            if(val.charAt(i)=='a' || val.charAt(i)=='e' ||
            val.charAt(i)=='i' || val.charAt(i)=='o' || val.charAt(i)=='u')
            {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :-");
        String val = sc.nextLine();

        a2 obj = new a2();
        System.out.println("No of vowels : " + obj.vowelCount(val));
        sc.close();
    }
}
