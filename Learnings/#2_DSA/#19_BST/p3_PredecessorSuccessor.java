import java.util.*;

public class p3_PredecessorSuccessor {
    static int pred = -1, succ = -1;
    static Node temp = null;
    static boolean flag = false;
    public static class Node{
        int val;
        Node left, right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void inOrder(Node root, List<Integer> arr){
        if(root==null) return;
        inOrder(root.left, arr);
        arr.add(root.val);
        inOrder(root.right, arr);
    }
    public static void inOrder2(Node root, int val){
        if(root==null) return;
        inOrder2(root.left, val);
        if(temp == null){
            temp = root;
        } else {
            if(root.val==val){
                pred = temp.val;
                flag = true;
            } else if(root.val>val && flag == true){
                succ = root.val;
                flag = false;
            } else {
                temp = root;
            }
        }
        inOrder2(root.right, val);
    }
    
    public static Node constructBFS(String arr[]){
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i=1;
        while (i<n-1) {
            Node temp = q.remove();
            Node left = new Node(0);
            Node right = new Node(0);
            if(arr[i].equals("")){
                left = null;
            } else {
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if(arr[i+1].equals("")){
                right = null;
            } else {
                int r = Integer.parseInt(arr[i+1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;

            i+=2;
        }
        return root;
    }
    public static void main(String[] args) {
        String a[] = {"50", "30", "70", "20", "40", "60", "80"};
        Node root = constructBFS(a);
        int val = 30;
        inOrder2(root, val);
        System.out.println(pred);
        System.out.println(succ);
        // List<Integer> arr = new ArrayList<>(); //S.C. = O(2n)
        // inOrder(root, arr);

        // int val = 28;
        // int idx = -1;
        // for(int i=0; i<arr.size(); i++){
        //     if(arr.get(i) == val){
        //         idx = i;
        //         break;
        //     }
        // }
        // System.out.println("Pred : " + arr.get(idx-1));
        // System.out.println("Succ : " + arr.get(idx+1));
    }
}
