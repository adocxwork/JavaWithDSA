import java.util.TreeSet;

public class p10_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);
        System.out.println("TreeSet (Sorted): " + treeSet);

        // Retrieve first and last elements
        System.out.println("First Element: " + treeSet.first());
        System.out.println("Last Element: " + treeSet.last());

        // Subset
        System.out.println("Subset (10 to 30): " + treeSet.subSet(10, 30));
    }
}

// Remove an element
// treeSet.remove(5);

/*
---Output---
TreeSet (Sorted): [10, 20, 30, 50]
First Element: 10
Last Element: 50
Subset (10 to 30): [10, 20]


| Feature         | HashSet          | LinkedHashSet       | TreeSet              |
|-----------------|------------------|---------------------|----------------------|
| Order           | Unordered        | Insertion Order     | Sorted Order         |
| Performance     | O(1)             | O(1)                | O(log n)             |
| Memory Usage    | Low              | Moderate            | High (tree nodes)    |
| Use Case        | Fast lookups     | Ordered storage     | Sorted storage       |

*/