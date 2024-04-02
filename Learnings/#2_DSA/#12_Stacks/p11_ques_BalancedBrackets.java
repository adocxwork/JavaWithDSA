import java.util.*;

public class p11_ques_BalancedBrackets {

    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.size() == 0)
                    return false;
                if (st.peek() == '(')
                    st.pop();
            }
        }
        if (st.size() > 0)
            return false;
        else
            return true;
    }

    public static int noOfBrRemoval(String str) {
        // minimum no of brackets to be removed in order to make it balanced bracket
        Stack<Character> st = new Stack<>();
        int n = str.length(), noOfBracketsToBeRemoved = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                } else {
                    noOfBracketsToBeRemoved++;
                }
            }
        }
        return noOfBracketsToBeRemoved + st.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
        System.out.println(noOfBrRemoval(str));
    }
}