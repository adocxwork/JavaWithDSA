import java.util.ArrayList;
public class p1_BasicOfArrayList{
    public static void main(String[] args) {

        // Creating wrapper class's object
        Integer k = Integer.valueOf(3); //k is an object
        System.out.println(k);
        Float j = Float.valueOf(3.33f);
        System.out.println(j);

        // ArrayList<Integer> l1 = new ArrayList<Integer>(ValuePassKrSakteHo);
        // ArrayList<Boolean> l2 = new ArrayList<>();
        // ArrayList<Float> l3 = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();

        // add new element
        l1.add(4);
        l1.add(7);
        l1.add(9);
        l1.add(3);

        // get an element at index i
        System.out.println(l1.get(1)); //7

        // get the size of ArrayList
        System.out.println(l1.size());

        // print with for loop
        for(int i=0; i<l1.size(); i++)
        {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();

        // printing the ArrayList directly
        System.out.println(l1);
        
        // adding element at some index i
        l1.add(1, 69);
        
        // modifying element at index i
        l1.set(1, 70);

        // removing an element at index i
        l1.remove(1);

        // removing an element e
        l1.remove(Integer.valueOf(7)); //this returns true(print krke dekho)
        // l1.remove(Integer.valueOf(100017)); //this will return false and no error will occur

        // checking if an element exists
        System.out.println(l1.contains(Integer.valueOf(3))); //true, l1 has 3
        System.out.println(l1.contains(Integer.valueOf(33))); //false, l1 doesn't has 33
        // Integer.valueOf(3) >> this is an Object

        // if you don't specify wrapper class inside <>, you can put anything(of any datatype) inside ArrayList
        ArrayList l = new ArrayList();
        l.add("pqres");
        l.add(1);
        l.add(true);
        System.out.println(l);

        // followup question
        System.out.println();
        ArrayList<Integer> l4 = new ArrayList<Integer>();
        System.out.println(l4.isEmpty()); //true
        l4.add(7);
        l4.add(2);
        l4.add(1);
        l4.add(2);
        l4.add(0);
        // l4.add(Integer.valueOf(7));
        // l4.add(Integer.valueOf(2));
        // l4.add(Integer.valueOf(1));
        // l4.add(Integer.valueOf(2));
        // l4.add(Integer.valueOf(0));
        System.out.println(l4); // [7,2,1,2,0]
        System.out.println(l4.indexOf(2)); // 1
        System.out.println(l4.lastIndexOf(2)); // 3
    }
}