import java.util.LinkedList;
import java.util.Queue;

public class p4_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Add elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("Initial Queue: " + queue);

        // Peek at the head of the queue
        System.out.println("Head of Queue: " + queue.peek());

        // Remove elements
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after removal: " + queue);

        // Check if empty
        System.out.println("Is Queue empty? " + queue.isEmpty());
    }
}

/*
---Output---
Initial Queue: [10, 20, 30]
Head of Queue: 10
Removed: 10
Queue after removal: [20, 30]
Is Queue empty? false

*/