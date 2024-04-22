import java.util.*;

public class p1_CollectionFramework {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // push()
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.remove(); //pop()
        System.out.println(q);
        q.poll(); //pop()
        System.out.println(q);

        // peek()
        System.out.println(q.element());
        System.out.println(q.peek());

        // Size()
        System.out.println("Size : " + q.size());

        // isEmpty()
        System.out.println(q.isEmpty());
    }
}
