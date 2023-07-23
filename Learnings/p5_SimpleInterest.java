import java.util.Scanner;

class p5_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle, rate, and time : -");
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        float t = sc.nextFloat();

        float si = (p*r*t)/100;

        System.out.println("Simple Interest : " + si);
    }
    
}
