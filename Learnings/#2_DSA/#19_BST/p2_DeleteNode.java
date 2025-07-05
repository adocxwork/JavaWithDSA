import java.util.LinkedList;
import java.util.Queue;

public class p2_DeleteNode {
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
    public static void deleteLeafNode(Node root, int target){
        if(root==null) return;
        if(root.val>target){ //go left
            if(root.left==null) return;
            if(root.left.val==target){
                root.left = null;
            } else {
                deleteLeafNode(root.left, target);
            }
        } else { //go right
            if(root.right==null) return;
            if(root.right.val==target){
                root.right = null;
            } else {
                deleteLeafNode(root.right, target);
            }
        }
    }

    // this function can delete leaf node as well as node which has 1 child
    public static void delete(Node root, int target){
        if(root==null) return;
        if(root.val>target){ //go left
            if(root.left==null) return;
            if(root.left.val==target){
                Node l = root.left; //l is node that i wish to delete
                if(l.left == null && l.right==null) root.left = null; // 0 children
                else if(l.left == null || l.right == null){ //1 child
                    if(l.left!=null) root.left = l.left;
                    else root.left = l.right;
                }
            } else {
                delete(root.left, target);
            }
        } else { //go right
            if(root.right==null) return;
            if(root.right.val==target){
                Node r = root.right; //r is node that i wish to delete
                if(r.left==null && r.right==null) root.right = null;
                else if(r.left==null || r.right==null){ //1 child
                    if(r.left!=null) root.right = r.left;
                    else root.right = r.right;
                }
            } else {
                delete(root.right, target);
            }
        }
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
        String arr[] = {"50", "20", "60", "17", "34", "55", "89", "10", "", "28", "", "", "", "70", "", "", "14"};
        Node root = constructBFS(arr);
        preOrder(root);
        System.out.println();
        delete(root, 89);
        preOrder(root);
    }
}
