import java.util.ArrayList;
import java.util.List;

public class p1_ArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial List: " + list);

        // Insert at a specific index
        list.add(1, "Orange");
        System.out.println("After insertion: " + list);

        // Access elements by index
        System.out.println("Element at index 2: " + list.get(2));

        // Modify an element
        list.set(2, "Grapes");
        System.out.println("After modification: " + list);

        // Remove by index
        list.remove(1);
        System.out.println("After removal: " + list);

        // Find index of an element
        System.out.println("Index of 'Apple': " + list.indexOf("Apple"));

        // Find last index of an element
        list.add("Apple");
        System.out.println("List after adding duplicate: " + list);
        System.out.println("Last index of 'Apple': " + list.lastIndexOf("Apple"));
    }
}

/*
---Output---

Initial List: [Apple, Banana, Cherry]
After insertion: [Apple, Orange, Banana, Cherry]
Element at index 2: Banana
After modification: [Apple, Orange, Grapes, Cherry]
After removal: [Apple, Grapes, Cherry]
Index of 'Apple': 0
List after adding duplicate: [Apple, Grapes, Cherry, Apple]
Last index of 'Apple': 3

*/



// Collections.sort(ArrayList_1);  // Sorts the ArrayList
// Collections.sort(ArrayList_1, Comparator.reverseOrder());  // Sorts the ArrayList in descending order
// Collections.reverse(ArrayList_1); // Reverse the list
// int index = Collections.binarySearch(ArrayList_1, 5); // returns the index of 5
// int frequency = Collections.frequency(ArrayList_1, "Apple"); // Count frequency of "Apple"
// Collections.shuffle(ArrayList_1); // Shuffle the list
// Find min and max
// System.out.println("Minimum: " + Collections.min(numbers));
// System.out.println("Maximum: " + Collections.max(numbers));