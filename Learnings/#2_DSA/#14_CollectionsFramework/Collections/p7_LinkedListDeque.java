import java.util.Deque;
import java.util.LinkedList;

public class p7_LinkedListDeque {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        // Add elements
        deque.addFirst("A");
        deque.addLast("B");
        deque.offerFirst("C");
        deque.offerLast("D");

        System.out.println("Deque: " + deque);

        // Remove and access
        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());
    }
}

/*
---Output---
Deque: [C, A, B, D]
Peek First: C
Peek Last: D

*/