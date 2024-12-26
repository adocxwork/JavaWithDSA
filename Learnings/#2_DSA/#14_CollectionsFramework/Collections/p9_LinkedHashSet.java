import java.util.LinkedHashSet;
import java.util.Set;

public class p9_LinkedHashSet {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Remove an element
        linkedHashSet.remove("Banana");
        System.out.println("After removal: " + linkedHashSet);
    }
}

/*
---Output---
LinkedHashSet: [Apple, Banana, Cherry]
After removal: [Apple, Cherry]
*/