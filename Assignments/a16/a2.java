import java.util.ArrayList;

public class a2 {
    static void removeThirdEle(ArrayList<Integer> l)
    {
        if(l.size()>=3) //handling exceptions
        l.remove(2);
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        // l.add(1);
        l.add(2);
        // l.add(3);
        // l.add(4);
        l.add(5);
        System.out.println(l);
        removeThirdEle(l);
        System.out.println(l);
    }
}
