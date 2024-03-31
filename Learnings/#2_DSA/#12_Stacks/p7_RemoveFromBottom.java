import java.util.Stack;

public class p7_RemoveFromBottom {
    public static void removeFromBottom(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while (st.size()>1) {
            temp.push(st.pop());
        }
        st.pop();
        while (temp.size()>0) {
            st.push(temp.pop());
        }
    }
    public static void removeAt(Stack<Integer> st, int idx){
        Stack<Integer> temp = new Stack<>();
        while (st.size()>idx+1) {
            temp.push(st.pop());
        }
        st.pop();
        while (temp.size()>0) {
            st.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        // remove from bottom/any index
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(5);
        st.push(7);
        st.push(9);
        System.out.println(st);
        // removeFromBottom(st);
        removeAt(st, 3);
        System.out.println(st);
    }
}
