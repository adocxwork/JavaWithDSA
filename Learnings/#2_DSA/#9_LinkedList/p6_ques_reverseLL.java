public class p6_ques_reverseLL {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        if(head==null){
            System.out.println();
            return;
        }
        System.out.print(head.val + " ");
        display(head.next);
    }
    public static Node reverse(Node head){
        if(head.next==null) return head;
        Node newNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
    public static void main(String[] args) {
        Node ob1 = new Node(3);
        Node ob2 = new Node(5);
        Node ob3 = new Node(1);
        Node ob4 = new Node(2);
        Node ob5 = new Node(4);
        ob1.next = ob2;
        ob2.next = ob3;
        ob3.next = ob4;
        ob4.next = ob5;
        display(ob1);
        ob1 = reverse(ob1);
        display(ob1);
    }
}
