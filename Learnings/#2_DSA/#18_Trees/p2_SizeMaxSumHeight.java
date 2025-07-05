public class p2_SizeMaxSumHeight {
    static int sizee=0;
    public static class Node{
        int val; //0
        Node left, right; //null
        public Node(int val){
            this.val = val;
        }
    }
    public static void preorderTraversal(Node root){
        if(root==null) return;
        System.out.println(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public static int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }
    public static int sum(Node root){
        if(root==null) return 0;
        return sum(root.left) + sum(root.right) + root.val;
    }
    public static int size(Node root){
        if(root==null) return 0;
        return size(root.left) + size(root.right) + 1;
    }
    public static void capacity(Node root){ //just to update size variable
        if(root==null) return;
        sizee++;
        capacity(root.left);
        capacity(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(500);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.right = e;

        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(height(root));
    }
}
