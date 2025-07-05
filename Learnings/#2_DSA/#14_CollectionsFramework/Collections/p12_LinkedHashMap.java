import java.util.LinkedHashMap;
import java.util.Map;

public class p12_LinkedHashMap {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Add key-value pairs
        linkedHashMap.put("Apple", 3);
        linkedHashMap.put("Banana", 5);
        linkedHashMap.put("Cherry", 7);
        System.out.println("LinkedHashMap: " + linkedHashMap);
    }
}

/*
---Output---
LinkedHashMap: {Apple=3, Banana=5, Cherry=7}

*/