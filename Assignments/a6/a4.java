// Q4. Print the sum, difference and product of two complex numbers by creating a class named
// 'Complex' with separate methods for each operation whose real and imaginary parts are
// entered by user.

import java.util.Scanner;

class Complex{
    void sum(double r1, double i1, double r2, double i2)
    {
        System.out.println("Sum :-");
        double r = r1+r2;
        double i = i1+i2;
        System.out.println(r + " + " + i + "i");
    }
    void difference(double r1, double i1, double r2, double i2)
    {
        System.out.println("Difference :-");
        double r = r1-r2;
        double i = i1-i2;
        System.out.println(r + " + " + i + "i");
    }
    void product(double r1, double i1, double r2, double i2)
    {
        System.out.println("Product :-");
        double Rres = (r1*r2) - (i1*i2);
        double Ires = ((r1*i2) + (r2*i1));
        System.out.println(Rres + " + " + Ires + "i");
    }
}

public class a4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of 1st complex number :-");
        double r1 = sc.nextDouble();
        System.out.println("Enter imaginary part of 1st complex number :-");
        double i1 = sc.nextDouble();
        System.out.println("Enter real part of 2nd complex number :-");
        double r2 = sc.nextDouble();
        System.out.println("Enter imaginary part of 2nd complex number :-");
        double i2 = sc.nextDouble();

        Complex obj = new Complex();
        obj.sum(r1, i1, r2, i2);
        obj.difference(r1, i1, r2, i2);
        obj.product(r1, i1, r2, i2);
        sc.close();
    }
}
