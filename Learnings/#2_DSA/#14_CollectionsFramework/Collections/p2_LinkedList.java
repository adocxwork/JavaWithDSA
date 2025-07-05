import java.util.LinkedList;

public class p2_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        System.out.println("Initial LinkedList: " + linkedList);

        // Add elements at the beginning and end
        linkedList.addFirst("Orange");
        linkedList.addLast("Grapes");
        System.out.println("After adding first and last: " + linkedList);

        // Access first and last elements
        System.out.println("First Element: " + linkedList.getFirst());
        System.out.println("Last Element: " + linkedList.getLast());

        // Remove elements
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("After removing first and last: " + linkedList);

        // Remove element by index
        linkedList.remove(1);
        System.out.println("After removing index 1: " + linkedList);

        // Add element at a specific position
        linkedList.add(1, "Peach");
        System.out.println("After adding at index 1: " + linkedList);
    }
}
/*
---Output---
Initial LinkedList: [Apple, Banana, Cherry]
After adding first and last: [Orange, Apple, Banana, Cherry, Grapes]
First Element: Orange
Last Element: Grapes
After removing first and last: [Apple, Banana, Cherry]
After removing index 1: [Apple, Cherry]
After adding at index 1: [Apple, Peach, Cherry]


| Feature           | ArrayList                 | LinkedList                 |
|-------------------|---------------------------|----------------------------|
| Implementation    | Dynamic Array             | Doubly Linked List         |
| Access Time       | O(1) (random access)      | O(n) (sequential)          |
| Insertion/Deletion| Slow (shift required)     | Fast (just relinking)      |
| Memory Usage      | Less                      | More (due to pointers)     |

*/