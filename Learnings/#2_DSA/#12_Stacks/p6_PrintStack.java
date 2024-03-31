import java.util.Stack;

public class p6_PrintStack {
    // T.C. = O(n), S.C. = O(n)
    public static void printStack(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while (st.size()>0) {
            temp.push(st.pop());
        }
        while (temp.size()>0) {
            int x = temp.pop();
            System.out.print(x + " ");
            st.push(x);
        }
        System.out.println();
    }
    public static void printStack2(Stack<Integer> st){ //better way
        int n = st.size(), j = n-1;
        int arr[] = new int[n];
        while (st.size()>0) {
            arr[j--] = st.pop();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
            st.push(arr[i]);
        }
        System.out.println();
    }
    public static void displayReverseRecursion(Stack<Integer> st){
        if(st.size()==0){
            System.out.println();
            return;
        }
        int top = st.pop();
        System.out.print(top + " ");
        displayReverseRecursion(st);
        st.push(top);
    }
    public static void displayRecursion(Stack<Integer> st){ //T.C. = O(n) S.C. = O(n)
        if(st.size()==0){
            return;
        }
        int top = st.pop();
        displayRecursion(st);
        System.out.print(top + " ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(5);
        st.push(7);
        st.push(9);
        // System.out.println(st);
        // displayReverseRecursion(st);
        displayRecursion(st);
        System.out.println(st);
    }
}
