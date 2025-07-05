import java.util.Stack;
public class p2_MoveStack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        st1.push(1);
        st1.push(5);
        st1.push(7);
        st1.push(9);

        System.out.println("st1 : " + st1);
        System.out.println("st2 : " + st2);
        System.out.println("st3 : " + st3);
        System.out.println();
        while (st1.size()>0) {
            st2.push(st1.pop()); //pop() also returns the element being removed
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
        System.out.println("Elements from st1 is moved to st3 in same order.");

    }
}
