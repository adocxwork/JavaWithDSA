import java.util.HashSet;
import java.util.Set;

public class p8_HashSet {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();

        // Add elements
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(10); // Duplicate, will not be added
        System.out.println("HashSet: " + hashSet);

        // Check if an element exists
        System.out.println("Contains 20? " + hashSet.contains(20));

        // Remove an element
        hashSet.remove(20);
        System.out.println("After removal: " + hashSet);

        // Size of the set
        System.out.println("Size of HashSet: " + hashSet.size());
    }
}

/*
---Output---
HashSet: [10, 20, 30]
Contains 20? true
After removal: [10, 30]
Size of HashSet: 2

*/