import java.util.Stack;

public class p8_OverflowUndreflow {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        // st.pop(); //error
        // st.peek(); //error - underflow
    }
}
