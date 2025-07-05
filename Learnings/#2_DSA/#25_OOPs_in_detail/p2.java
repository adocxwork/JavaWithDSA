class Pen {
    String color, type;
    public void write() {
        System.out.println("Writing something...");
    }
}
public class p2 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        pen1.write();
    }
}
