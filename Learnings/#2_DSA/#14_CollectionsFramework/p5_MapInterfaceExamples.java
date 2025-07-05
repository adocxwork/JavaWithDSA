import java.util.*;
public class p5_MapInterfaceExamples {
    static void MapInterfaceExamples(){
        // HashMap<Integer, String> mp = new HashMap<>(); // ye bhi chalega..
        Map<Integer, String> mp = new HashMap<>();
        mp.put(1, "Adi");
        mp.put(2, "Aditya");
        mp.put(3, "Aditya Gupta");
        mp.put(1, "Ad!"); //over rides...
        mp.putIfAbsent(2, "CoderProMax"); //no over riding..

        System.out.println(mp);
        System.out.println(mp.entrySet()); //prints map
        System.out.println(mp.keySet()); //prints keys
        System.out.println(mp.values()); //prints values
        System.out.println(mp.get(2)); //Aditya
        System.out.println(mp.containsKey(4)); //false
        System.out.println(mp.containsValue("Adi")); //true
        System.out.println(mp.containsValue("Adii")); //false
    }
    static void MapInterfaceExamples2(){
        Map<Integer, String> mp = new HashMap<>();
        mp.put(1, "Adi");
        mp.put(2, "Aditya");
        mp.put(3, "Aditya Gupta");

        // iterate over keys
        for(Integer i : mp.keySet()){
            System.out.println(i);
        }
        // or...........
        for(var i : mp.keySet()){
            System.out.println(i);
        }
        // iterate over values
        for(String i : mp.values()){
            System.out.println(i);
        }
        // iterate over key-values
        for(var e : mp.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
    static void LinkedHashMapInterfaceExamples(){
        Map<Integer, String> mp = new LinkedHashMap<>();
        mp.put(1, "Adi");
        mp.put(3, "Aditya Gupta");
        mp.put(2, "Aditya");

        // order is preserved here..
        for(var e : mp.entrySet()){
            System.out.println(e);
        }
    }
    static void TreeMapInterfaceExamples(){
        TreeMap<Integer, String> mp = new TreeMap<>();
        mp.put(1, "Adi");
        mp.put(3, "Aditya Gupta");
        mp.put(2, "Aditya");

        // It will be sorted...
        for(var e : mp.entrySet()){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        // MapInterfaceExamples();
        // MapInterfaceExamples2();
        // LinkedHashMapInterfaceExamples();
        TreeMapInterfaceExamples();
    }
}
