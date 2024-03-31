import java.util.Stack;

public class p4_InsertAtBottom {
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
    public static void insertAtBottomRecursion(Stack<Integer> st, int val){
        if(st.size()==0){
            st.push(val);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, val);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st1.push(2);
        st1.push(5);
        st1.push(7);
        st1.push(9);
        
        System.out.println("st1 : " + st1);
        System.out.println("st2 : " + st2);
        System.out.println();
        while (st1.size()>0) {
            st2.push(st1.pop());
        }
        System.out.println("st1 : " + st1);
        System.out.println("st2 : " + st2);
        System.out.println();
        st1.push(1);
        while (st2.size()>0) {
            st1.push(st2.pop());
        }
        System.out.println("st1 : " + st1);
        System.out.println("st2 : " + st2);
        System.out.println();

        // System.out.println(st1);
        // insertAtBottomRecursion(st1, 99);
        // System.out.println(st1);
    }
}
