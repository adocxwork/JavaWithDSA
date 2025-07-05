import java.util.PriorityQueue;

public class p14_PriorityQueue_minHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add elements
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(5);

        System.out.println("PriorityQueue: " + minHeap);

        // Access and remove elements
        System.out.println("Peek: " + minHeap.peek()); // Smallest element
        System.out.println("Poll: " + minHeap.poll()); // Removes smallest
        System.out.println("After Poll: " + minHeap);
    }
}

/*
---Output---
PriorityQueue: [5, 20, 10]
Peek: 5
Poll: 5
After Poll: [10, 20]

*/