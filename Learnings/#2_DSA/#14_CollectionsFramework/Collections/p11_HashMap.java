import java.util.HashMap;
import java.util.Map;

public class p11_HashMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs
        hashMap.put("Apple", 3);
        hashMap.put("Banana", 5);
        hashMap.put("Cherry", 7);
        System.out.println("HashMap: " + hashMap);

        // Access a value
        System.out.println("Value for 'Banana': " + hashMap.get("Banana"));

        // Remove a key-value pair
        hashMap.remove("Apple");
        System.out.println("After removal: " + hashMap);

        // Check if a key exists
        System.out.println("Contains key 'Cherry'? " + hashMap.containsKey("Cherry"));

        // Iterate over keys and values
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

/*
---Output---
HashMap: {Apple=3, Banana=5, Cherry=7}
Value for 'Banana': 5
After removal: {Banana=5, Cherry=7}
Contains key 'Cherry'? true
Banana -> 5
Cherry -> 7

*/