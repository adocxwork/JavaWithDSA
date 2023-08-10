// Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
// creating a class named 'Triangle' without any parameter in its constructor.
// area=root(s(s-a)(s-b)(s-c))    s=(a+b+c)/2
import java.lang.Math;
class Triangle{
    double area(double l, double b, double h)
    {
        double s = (l+b+h)/2;
        double ss = s*((s-l)*(s-b)*(s-h));
        return Math.sqrt(ss);
    }

    double perimeter(double l, double b, double h)
    {
        return l+b+h;
    }
}
public class a2 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        System.out.println("Area :-");
        System.out.println(t1.area(3,4,5) + " square units");

        System.out.println();

        System.out.println("Parameter :-");
        System.out.println(t1.perimeter(3,4,5) + " units");
    }
}
