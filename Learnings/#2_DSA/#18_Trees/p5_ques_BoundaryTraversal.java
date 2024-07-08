import java.util.LinkedList;
import java.util.Queue;

public class p5_ques_BoundaryTraversal {
    public static class Node{
        int val;
        Node left, right;
        public Node(int val){
            this.val = val;
        }
    }
    public static int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
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
    public static void boundaryDisplay(Node root){
        leftBoundary(root);
        System.out.println();
        bottomBoundary(root);
        System.out.println();
        rightBoundary(root.right);
    }
    public static void rightBoundary(Node root){
        if(root==null || (root.left==null && root.right==null)) return;
        if(root.right!=null) rightBoundary(root.right);
        else rightBoundary(root.left);
        System.out.print(root.val+ " ");
    }
    public static void bottomBoundary(Node root){
        if(root==null) return;
        if(root.left==null && root.right==null){
            System.out.print(root.val+" ");
            return;
        }
        bottomBoundary(root.left);
        bottomBoundary(root.right);
    }
    public static void leftBoundary(Node root){
        if(root==null || (root.left==null && root.right==null)) return;
        System.out.print(root.val+ " ");
        if(root.left!=null) leftBoundary(root.left);
        else leftBoundary(root.right);
    }
    public static void main(String[] args) {
        String arr[] = {"1", "2", "3", "4", "5", "", "6", "7", "", "8", "", "9", "10", "", "11", "", "12", "", "13", "", "14", "15", "16", "", "17", "", "", "18", "", "19", "", "", "", "20", "21", "22", "23", "", "24", "25", "26", "27", "", "", "28", "", ""};

        Node root = constructBFS(arr);

        // int level = height(root)+1;
        // for(int i=1; i<=level; i++){
        //     nthLevel(root, i);
        //     System.out.println();
        // }

        boundaryDisplay(root);
    }
}
