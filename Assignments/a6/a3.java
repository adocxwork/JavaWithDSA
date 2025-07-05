// Q3. Write a program to print the area of a rectangle by creating a class named 'Area' taking the values
// of its length and breadth as parameters of its constructor and having a method named 'returnArea'
// which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

import java.util.Scanner;

class Area{
    double returnArea(double l, double b)
    {
        return l*b;
    }
}


public class a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Lenght & Breadth :-");
        double len = sc.nextDouble();
        double bre = sc.nextDouble();

        Area rec = new Area();
        System.out.println(rec.returnArea(len, bre) + " units");
        sc.close();
    }
}
