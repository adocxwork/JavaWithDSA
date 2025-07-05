import java.util.LinkedList;
import java.util.Queue;

public class p1_TraversalsBST{
    public static class Node{
        int val;
        Node left, right;
        public Node(int val){
            this.val = val;
        }
    }
    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
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
        String arr[] = {"10", "5", "15", "2", "8", "12", "17"};
        Node root = constructBFS(arr);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }
}