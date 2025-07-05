import java.util.*;

public class p12_ques_ReorderQueue {
    public static void reorder(Queue<Integer> q, int n) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n / 2; i++)
            st.push(q.remove());
        while (!st.isEmpty())
            q.add(st.pop());
        for (int i = 0; i < n / 2; i++)
            st.push(q.remove());
        for (int i = 0; i < n / 2; i++) {
            q.add(st.pop());
            q.add(q.remove());
        }

        // reverse queue using stack..
        while (!q.isEmpty())
            st.push(q.remove());
        while (!st.isEmpty())
            q.add(st.pop());
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q);
        reorder(q, q.size());
        System.out.println(q);
    }
}
