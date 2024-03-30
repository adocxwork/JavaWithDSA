public class p2_doubly_LinkedList {
    public static class Node{
        int val;
        Node prev, next;
        Node (int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head.next;
        System.out.print(head.val + " ");
        while (temp!=head) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node ob1 = new Node(4);
        Node ob2 = new Node(1);
        Node ob3 = new Node(2);
        Node ob4 = new Node(5);
        Node ob5 = new Node(7);
        ob1.next = ob2;
        ob1.prev = ob5;
        ob2.next = ob3;
        ob2.prev = ob1;
        ob3.next = ob4;
        ob3.prev = ob2;
        ob4.next = ob5;
        ob4.prev = ob3;
        ob5.next = ob1;
        ob5.prev = ob4;

        display(ob1);
    }
}
