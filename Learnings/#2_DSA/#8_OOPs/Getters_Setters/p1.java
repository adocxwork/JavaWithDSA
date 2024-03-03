import f2.p2;

public class p1{
    public static void main(String[] args) {
        p2 ob = new p2();
        // ob.name = "Adi"; //can't do this..
        System.out.println(ob.getPin());
        ob.setPin(9231);
        System.out.println(ob.getPin());
    }
}