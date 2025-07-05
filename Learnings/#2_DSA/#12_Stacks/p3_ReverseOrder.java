import java.util.Stack;

public class p3_ReverseOrder {
    // HW recursion se karo..!
    public static void insertAtBottom(Stack<Integer> st, int val){
        Stack<Integer> temp = new Stack<>();
        while (st.size()>0) {
            temp.push(st.pop());
        }
        st.push(val);
        while (temp.size()>0) {
            st.push(temp.pop());
        }
    }
    public static void reverse(Stack<Integer> st){
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        while (st.size()>0) {
            st1.push(st.pop());
        }
        while (st1.size()>0) {
            st2.push(st1.pop());
        }
        while (st2.size()>0) {
            st.push(st2.pop());
        }
    }
    public static void reverseRecursion(Stack<Integer> st){
        if(st.size()==1){
            return;
        }
        int top = st.pop();
        reverseRecursion(st);
        insertAtBottom(st, top);
    }
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        st1.push(2);
        st1.push(5);
        st1.push(7);
        st1.push(9);

        System.out.println("st1 : " + st1);
        System.out.println("st2 : " + st2);
        System.out.println("st3 : " + st3);
        System.out.println();
        
        while (st1.size()>0) {
            st2.push(st1.pop());
        }
        System.out.println("st1 : " + st1);
        System.out.println("st2 : " + st2);
        System.out.println("st3 : " + st3);
        System.out.println();
        while (st2.size()>0) {
            st3.push(st2.pop());
        }
        System.out.println("st1 : " + st1);
        System.out.println("st2 : " + st2);
        System.out.println("st3 : " + st3);
        System.out.println();
        while (st3.size()>0) {
            st1.push(st3.pop());
        }
        System.out.println("st1 : " + st1);
        System.out.println("st2 : " + st2);
        System.out.println("st3 : " + st3);
        System.out.println();

        // System.out.println(st1);
        // reverseRecursion(st1);
        // System.out.println(st1);
    }
}
