import java.util.ArrayList;

public class a1{
    static void addEle(ArrayList<Integer> l, int index, int ele)
    {
        l.add(index, ele);
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l);
        addEle(l, 0, 7);
        System.out.println(l);
    }
}