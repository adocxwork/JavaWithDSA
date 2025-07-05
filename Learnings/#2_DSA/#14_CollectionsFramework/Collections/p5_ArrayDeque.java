import java.util.ArrayDeque;
import java.util.Deque;

public class p5_ArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // Add elements
        deque.addFirst(10);
        deque.addLast(20);
        deque.offerFirst(5);
        deque.offerLast(25);

        System.out.println("Deque: " + deque);

        // Access elements
        System.out.println("First Element: " + deque.getFirst());
        System.out.println("Last Element: " + deque.getLast());

        // Remove elements
        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());
        System.out.println("After Removals: " + deque);
    }
}

/*
---Output---
Deque: [5, 10, 20, 25]
First Element: 5
Last Element: 25
Removed First: 5
Removed Last: 25
After Removals: [10, 20]

*/