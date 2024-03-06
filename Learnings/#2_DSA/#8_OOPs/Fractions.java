public class Fractions {
    public static fractions add(fractions f1, fractions f2){
        fractions f3 = new fractions((f1.num*f2.den + f2.num*f1.den), f1.den*f2.den);
        return f3;
    }
    public static void add2(fractions f1, fractions f2){
        int n = f1.num*f2.den + f2.num*f1.den, d = f1.den*f2.den;
        f1.num = n;
        f1.den = d;
    }
    public static fractions sub(fractions f1, fractions f2){
        fractions f3 = new fractions((f1.num*f2.den - f2.num*f1.den), f1.den*f2.den);
        return f3;
    }
    public static fractions mul(fractions f1, fractions f2){
        fractions f3 = new fractions((f1.num*f2.num), (f1.den*f2.den));
        return f3;
    }
    public static fractions div(fractions f1, fractions f2){
        fractions f3 = new fractions((f1.num*f2.den), (f1.den*f2.num));
        return f3;
    }
    public static int gcd(int x, int y){
        if(x==0) return y;
        return gcd(y%x, x);
    }
    public static class fractions{
        int num, den;
        public fractions(int num, int den){
            this.num = num;
            this.den = den;
            simplify();
        }
        public void simplify(){
            int hcf = gcd(num, den);
            num/=hcf;
            den/=hcf;
        }
        public void display(){
            System.out.println(num + " / " + den);
        }
    }
    public static void main(String[] args) {
        fractions f1 = new fractions(35, 21);
        fractions f2 = new fractions(7, 3);
        fractions f3 = add(f1, f2);
        fractions f4 = mul(f1, f2);
        fractions f5 = sub(f1, f2);
        fractions f6 = div(f1, f2);
        f1.display();
        f2.display();
        System.out.println("Addition");
        f3.display();
        System.out.println("Multiplication");
        f4.display();
        System.out.println("Substraction");
        f5.display();
        System.out.println("Division");
        f6.display();
    }
}
