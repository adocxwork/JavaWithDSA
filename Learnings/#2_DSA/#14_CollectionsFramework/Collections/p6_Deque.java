import java.util.Deque;
import java.util.LinkedList;

public class p6_Deque {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        // Add elements to both ends
        deque.addFirst("Front");
        deque.addLast("Back");
        System.out.println("Deque after adding elements: " + deque);

        // Peek at both ends
        System.out.println("First Element: " + deque.peekFirst());
        System.out.println("Last Element: " + deque.peekLast());

        // Remove elements from both ends
        System.out.println("Removed from Front: " + deque.pollFirst());
        System.out.println("Removed from Back: " + deque.pollLast());
        System.out.println("Deque after removals: " + deque);

        // Check if empty
        System.out.println("Is Deque empty? " + deque.isEmpty());
    }
}

/*
---Output---
Deque after adding elements: [Front, Back]
First Element: Front
Last Element: Back
Removed from Front: Front
Removed from Back: Back
Deque after removals: []
Is Deque empty? true

*/