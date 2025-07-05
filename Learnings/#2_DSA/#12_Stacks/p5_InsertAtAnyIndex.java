import java.util.Stack;

public class p5_InsertAtAnyIndex {
    public static void insertAt(Stack<Integer> st, int index, int val){
        Stack<Integer> temp = new Stack<>();
        while (st.size()>index) {
            temp.push(st.pop());
        }
        st.push(val);
        while (temp.size()>0) {
            st.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(4);
        st1.push(7);
        st1.push(9);
        System.out.println(st1);
        insertAt(st1, 2, 3);
        System.out.println(st1);
    }
}
