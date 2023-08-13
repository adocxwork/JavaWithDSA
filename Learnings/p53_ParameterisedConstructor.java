class Algeb{
    
    int a,b;
    Algeb(int x, int y)
    {
        System.out.println("Constructor is called..!");
        a=x;
        b=y;
    }
    
    int add()
    {
        return a+b;
    }
    int sub()
    {
        return a-b;
    }
}

public class p53_ParameterisedConstructor {
    public static void main(String[] args) {
        Algeb obj = new Algeb(7,5); //passing values through constructor

        System.out.println(obj.add());
        System.out.println(obj.sub());
    }
}
