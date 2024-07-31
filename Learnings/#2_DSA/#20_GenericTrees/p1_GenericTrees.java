import java.util.*;

public class p1_GenericTrees {
    public static class Node {
        int value;
        List<Node> child;

        Node(int value) {
            this.value = value;
            child = new ArrayList<>();
        }
    }

    public static void formTree(Node root) {
        root.child.add(new Node(5));
        root.child.add(new Node(11));
        root.child.add(new Node(63));

        root.child.get(0).child.add(new Node(1));
        root.child.get(0).child.add(new Node(4));
        root.child.get(0).child.add(new Node(8));

        root.child.get(1).child.add(new Node(6));
        root.child.get(1).child.add(new Node(7));
        root.child.get(1).child.add(new Node(15));

        root.child.get(2).child.add(new Node(31));
        root.child.get(2).child.add(new Node(55));
        root.child.get(2).child.add(new Node(65));
    }

    public static void preOrderTraversal(Node root) {
        if (root.child.isEmpty()) {
            System.out.print(root.value + " ");
            return;
        }
        System.out.print(root.value + " ");
        int n = root.child.size();
        for (int i = 0; i < n; i++) {
            preOrderTraversal(root.child.get(i));
        }
    }

    public static void postOrderTraversal(Node root) {
        if (root.child.isEmpty()) {
            System.out.print(root.value + " ");
            return;
        }
        int n = root.child.size();
        for (int i = 0; i < n; i++) {
            postOrderTraversal(root.child.get(i));
        }
        System.out.print(root.value + " ");
    }

    public static void levelOrderTraversal(Node root) { // BFS
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node currentNode = q.peek();
            System.out.print(currentNode.value + " ");
            q.remove();
            int noOfChildren = currentNode.child.size();
            for (int i = 0; i < noOfChildren; i++) {
                q.add(currentNode.child.get(i));
            }
        }
    }

    public static void zigzagOrderTraversal(Node root) { // BFS
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean flag = false;
        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Node> currentLevel = new ArrayList<>();
            while (levelSize-- > 0) {

                Node currentNode = q.peek();
                currentLevel.add(currentNode);
                q.remove();
                int noOfChildren = currentNode.child.size();
                for (int i = 0; i < noOfChildren; i++) {
                    q.add(currentNode.child.get(i));
                }
            }
            if(flag == false){
                printNodeList(currentLevel);
            } else {
                Collections.reverse(currentLevel);
                printNodeList(currentLevel);
            }
            flag = !flag;
        }
    }
    public static void printNodeList(List<Node> nodeList){
        for(int i=0; i<nodeList.size(); i++){
            System.out.print(nodeList.get(i).value + " ");
        }
        System.out.println();
    }
    public static int findMax(Node root){
        if(root.child.isEmpty()){
            return root.value;
        }
        int maxTillNow = root.value;
        int n = root.child.size();
        for(int i=0; i<n; i++){
            int childMax = findMax(root.child.get(i));
            if(childMax > maxTillNow){
                maxTillNow = childMax;
            }
        }
        return maxTillNow;
    }
    public static void mirrorTree(Node root){
        if(root.child.isEmpty()){
            return;
        }
        int noOfChildren = root.child.size();
        if(noOfChildren == 1){
            return;
        }
        for(int i=0; i<noOfChildren; i++){
            mirrorTree(root.child.get(i));
            Collections.reverse(root.child);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(30);
        formTree(root);
        // postOrderTraversal(root);
        levelOrderTraversal(root);
        System.out.println();
        // zigzagOrderTraversal(root);
        
        // System.out.println(findMax(root));

        mirrorTree(root);
        levelOrderTraversal(root);
    }
}