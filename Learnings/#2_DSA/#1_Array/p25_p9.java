// swap two numbers without third variable
public class p25_p9 {
    static void swapNumbers(int a, int b)
    {
        System.out.println("The value of a : " + a);
        System.out.println("The value of b : " + b);
        System.out.println();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("The value of a : " + a);
        System.out.println("The value of b : " + b);
    }
    public static void main(String[] args) {
        int a = 7;
        int b = 11;
        swapNumbers(a, b);
    }
}
