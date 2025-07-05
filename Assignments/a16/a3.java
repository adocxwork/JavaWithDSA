import java.util.ArrayList;

public class a3 {
    static void swapTwoEle(ArrayList<Integer> l, int i, int j)
    {
        Integer temp = Integer.valueOf(l.get(i));
        l.set(i, l.get(j));
        l.set(j, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l);
        swapTwoEle(l, 2, 4);
        System.out.println(l);
    }
}
