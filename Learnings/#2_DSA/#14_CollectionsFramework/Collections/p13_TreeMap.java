import java.util.TreeMap;

public class p13_TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add key-value pairs
        treeMap.put("Banana", 5);
        treeMap.put("Apple", 3);
        treeMap.put("Cherry", 7);
        System.out.println("TreeMap (Sorted): " + treeMap);

        // Access the first and last keys
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());
    }
}

/*
---Output---
TreeMap (Sorted): {Apple=3, Banana=5, Cherry=7}
First Key: Apple
Last Key: Cherry


| Feature          | HashMap                      | LinkedHashMap            | TreeMap                        |
|------------------|------------------------------|--------------------------|--------------------------------|
| Order            | Unordered                    | Insertion Order          | Sorted Order                   |
| Performance      | O(1)                         | O(1)                     | O(log n)                       |
| Null Keys/Values | 1 null key, many null values | Same                     | No null keys, many null values |

*/