public class p1{
    public static void main(String[] args) {
        System.out.println(p2.getCount()); // static elements can be accessed using their class name

        p2 ob1 = new p2(1, "Aditya");
        p2 ob2 = new p2(2, "Avinash");
        p2 ob3 = new p2(3, "Soham");
        // System.out.println(ob1.count);
        // System.out.println(ob2.count);
        // System.out.println(ob3.count);
        System.out.println(ob1.getCount());
        System.out.println(ob2.getCount());
        System.out.println(ob3.getCount());
    }
}