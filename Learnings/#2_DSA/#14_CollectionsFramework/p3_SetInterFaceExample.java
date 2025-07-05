import java.util.*;

public class p3_SetInterFaceExample {
    static void HashSetExample(){
        HashSet<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st); //1 2 3
        st.add(1);
        st.add(1);
        st.add(2);
        System.out.println(st); //1 2 3
        st.remove(2);
        System.out.println(st.contains(2)); //false
        System.out.println(st.size()); //2
    }
    static void LinkedHashSetExample(){
        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(15);
        st.add(10);
        System.out.println(st); //order will be the same...
    }
    static void TreeSetExample(){
        TreeSet<Integer> st = new TreeSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(15);
        st.add(10);
        System.out.println(st); //order will sorted...
    }
    public static void main(String[] args) {
        // HashSetExample();
        // LinkedHashSetExample();
        TreeSetExample();
    }
}
