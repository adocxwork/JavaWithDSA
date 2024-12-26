
import java.util.Collections;
import java.util.PriorityQueue;

public class p15_PriorityQueue_maxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add elements
        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(5);

        System.out.println("Max-Heap: " + maxHeap);

        // Access and remove elements
        System.out.println("Peek: " + maxHeap.peek()); // Largest element
        System.out.println("Poll: " + maxHeap.poll()); // Removes largest
        System.out.println("After Poll: " + maxHeap);
    }
}

/*
---Output---
Max-Heap: [20, 10, 5]
Peek: 20
Poll: 20
After Poll: [10, 5]

*/