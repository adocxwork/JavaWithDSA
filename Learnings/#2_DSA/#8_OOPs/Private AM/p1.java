public class p1 {
    public static void main(String[] args) {
        class p2 {
            private String n2; //same scope tk hi accessible rahega..
        }
        
        p2 ob = new p2();
        ob.n2 = "Adi";
        System.out.println(ob.n2);
    }
}
