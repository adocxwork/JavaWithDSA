import java.util.*;

public class p2_PrintQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> p = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            p.add(q.peek());
            q.remove();
        }
        System.out.println();
        while (!p.isEmpty()) {
            q.add(p.peek());
            p.remove();
        }
        System.out.println(q);
    }
}
