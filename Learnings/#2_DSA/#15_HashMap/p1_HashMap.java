import java.util.*;
public class p1_HashMap{
    public static void main(String[] args) {
        // Syntax
        // HashMap<String, Integer> mp = new HashMap<>(); //this will also work
        Map<String, Integer> mp = new HashMap<>();

        // Adding elements
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);

        // Getting value of a key
        System.out.println(mp.get("Yash")); //16
        System.out.println(mp.get("Rahul")); //null

        // Changing value of a key
        mp.put("Akash", 25); //Akash --> 25
        System.out.println(mp.get("Akash"));

        // Remove a entry
        System.out.println(mp.remove("Akash")); //25
        System.out.println(mp.remove("riya")); //null

        // Checking if a key is in the HashMap
        System.out.println(mp.containsKey("Akash")); //false
        System.out.println(mp.containsKey("Yash")); //true

        // Adding a new entry only if the new key doesn't exist already
        System.out.println(mp);
        mp.putIfAbsent("Yash", 30);
        if(!mp.containsKey("Yash")) mp.put("Yash", 30);

        mp.putIfAbsent("Yash", 30); //will not enter
        mp.putIfAbsent("Yashika", 30); //will enter
        System.out.println(mp);

        // Getting all the keys in the HashMap
        System.out.println(mp.keySet());

        // Getting all the values in the HashMap
        System.out.println(mp.values());

        // Get all entries in the HashMap
        System.out.println(mp.entrySet());
        // Data type - Map.Entry<K, V>

        // Traversing all enytries of Hashmap
        for(String e : mp.keySet()){
            System.out.println("Age of " + e + " is " + mp.get(e));
        }
        System.out.println();
        for(Map.Entry<String, Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        System.out.println();
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
    }
}