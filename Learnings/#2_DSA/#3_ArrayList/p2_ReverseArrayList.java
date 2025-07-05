import java.util.ArrayList;
import java.util.Collections;

public class p2_ReverseArrayList {
    static void reverseList(ArrayList<Integer> l)
    {
        int i=0, j=l.size()-1;
        while(i<j)
        {
            // int temp = l.get(i);
            // this also works bt, it's not the right way to do...

            Integer temp = Integer.valueOf(l.get(i));
            // list k ander sb objects hai..!!
            // (elements are not of PDT anymore)
            l.set(i, l.get(j));
            l.set(j, temp);
            i++;
            j--;
        }        
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(3);
        l.add(0);
        l.add(2);
        l.add(5);
        l.add(7);
        l.add(9);
        l.add(8);
        System.out.println(l);
        // reverseList(l);
        Collections.reverse(l); //Collections is a class
        System.out.println(l);

        // sorting
        // Collections.sort(l);
        // decending order
        Collections.sort(l, Collections.reverseOrder()); //passing comparator
        System.out.println(l);
    }
}
