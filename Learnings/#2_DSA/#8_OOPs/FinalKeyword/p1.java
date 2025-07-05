public class p1{
    public static void main(String[] args) {
        p2 s1 = new p2(1, "Adi");
        p2 s2 = new p2(2, "Aditya");
        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);
        // s1.schoolName = "ST. Johns";

        /*
            final attributes can be accessed but,
            can not be changed...

            Not even through setter function.

            final attributes are same for every 
            object.
        */
    }
}