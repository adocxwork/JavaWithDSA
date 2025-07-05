import java.util.Stack;

public class p12_ques_RemoveConsecutinveSubsequences {
    public static void display(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] stackToArray(Stack<Integer> st) {
        int n = st.size();
        int arr[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        return arr;
    }

    public static int[] remove(int arr[]) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else if (st.peek() == arr[i]) {
                if (i == n - 1 || arr[i] != arr[i + 1]) {
                    st.pop();
                }
            }
        }
        return stackToArray(st);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2 };
        int res[] = remove(arr);
        display(res);
    }
}
