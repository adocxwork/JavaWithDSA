import java.util.*; //all the class are available in util package...

public class p1_ListInterfaceExamples {
    static void ArrayListExamples(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(1)); //2
        l.set(1, 10);
        System.out.println(l);
        System.out.println(l.contains(10));
    }
    static void LinkedListExamples(){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.get(1)); //2
        l.set(1, 10);
        System.out.println(l);
        System.out.println(l.contains(10));
    }
    static void StackExample(){
        Stack<String> st = new Stack<>();
        st.push("Adi");
        st.push("Aditya");
        System.out.println(st.peek()); //Aditya
        System.out.println(st.pop()); //Aditya (will also remove it..)
        System.out.println(st.peek()); //Adi
        System.out.println(st.size()); //1
        System.out.println(st.isEmpty());
        System.out.println(st.empty());
    }
    public static void main(String[] args) {
        // ArrayListExamples();
        // LinkedListExamples();
        StackExample();
    }
}
