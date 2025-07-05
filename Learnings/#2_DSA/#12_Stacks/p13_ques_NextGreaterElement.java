import java.util.Stack;

public class p13_ques_NextGreaterElement {
    public static void display(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] nextGreaterElement(int arr[]) { //T.C. = O(n^2)
        int n = arr.length;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    ans[i] = arr[j];
                    break;
                }
                ans[i] = -1;
            }
        }
        return ans;
    }
    public static int[] nextGreaterElement2(int arr[]) { //T.C. = O(n), S.C. = O(n)
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        ans[n-1] = -1;
        st.push(arr[n-1]);
        for (int i = n-2; i >= 0; i--) {
            while (st.size()>0 && arr[i]>st.peek()) {
                st.pop();
            }
            if(st.size()==0) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 8, 6, 3, 4 };
        int res[] = nextGreaterElement2(arr);
        display(res);
    }
}
