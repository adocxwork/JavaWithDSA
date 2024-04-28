import java.util.*;

public class p9_deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addFirst(5);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());

        System.out.println();
        System.out.println(dq);
        dq.add(7); //add at last
        System.out.println(dq);
        
        dq.remove(); //remove at start
        System.out.println(dq);
        // dq.removeAll(dq); //removes everything
        System.out.println(dq);
        dq.addFirst(3);
        System.out.println(dq);
        // dq.removeFirstOccurrence(3); //removes first occurence
        dq.removeLastOccurrence(3); //removes last occurence
        System.out.println(dq);

    }
}