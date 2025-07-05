import java.util.*;

public class p3_PreInPost {
    public static class Node{
        int val; //0
        Node left, right; //null
        public Node(int val){
            this.val = val;
        }
    }
    public static void pip(int n){
        if(n==0) return;
        System.out.println("Pre " + n);
        pip(n-1);
        System.out.println("In " + n);
        pip(n-1);
        System.out.println("Post " + n);
    }
    public static void preOrder(Node root){
        // preorder is root left right
        if(root==null) return;
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        // inorder is left root right
        if(root==null) return;
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        // postorder is left right root
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }
    public static void nthLevel(Node root, int n){ //left to right
        if(root==null) return;
        if(n==1) {
            System.out.print(root.val + " ");
            return;
        }
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }
    public static void nthLevel2(Node root, int n){ //right to left
        if(root==null) return;
        if(n==1) {
            System.out.print(root.val + " ");
            return;
        }
        nthLevel2(root.right, n-1);
        nthLevel2(root.left, n-1);
    }
    public static int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void BFS(Node root){ //iterative
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while (q.size()>0) {
            Node temp = q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;

        // preOrder(root);
        // inOrder(root);
        // postOrder(root);
        // nthLevel(root, 3);

        int level = height(root)+1;
        for(int i=1; i<=level; i++){
            if(i%2!=0) nthLevel(root, i);
            else nthLevel2(root, i);
            System.out.println();
        }

        // BFS(root);
    }
}
