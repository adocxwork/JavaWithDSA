public class p4_question {
    public static int size(Node head){
        int s = 0;
        Node temp = head;
        while (temp!=null) {
            temp = temp.next;
            s++;
        }
        return s;
    }
    public static Node NthNodeFromEnd(int n, Node head){
        Node temp = head;
        int idx = size(head)-n+1;
        for(int i=1; i<=idx-1; i++){
            temp = temp.next;
        }
        return temp;
    }
    public static Node NthNodeFromEnd2(int n, Node head){ //better code
        Node slow = head, fast = head;
        for(int i=1; i<=n; i++){
            fast = fast.next;
        }
        while (fast!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static Node deleteNthNodeFromEnd(int n, Node head){
        Node slow = head, fast = head;
        for(int i=1; i<=n; i++){
            fast = fast.next;
        }
        if(fast==null){
            head = head.next;
            return head;
        }
        while (fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void display(Node head){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node ob1 = new Node(100);
        Node ob2 = new Node(13);
        Node ob3 = new Node(4);
        Node ob4 = new Node(5);
        Node ob5 = new Node(12);
        Node ob6 = new Node(10);
        ob1.next = ob2;
        ob2.next = ob3;
        ob3.next = ob4;
        ob4.next = ob5;
        ob5.next = ob6;
        // 100 13 4 5 12 10
        System.out.println(NthNodeFromEnd(3, ob1).data);
        System.out.println(NthNodeFromEnd2(3, ob1).data);
        display(ob1);
        ob1 = deleteNthNodeFromEnd(6, ob1);
        display(ob1);
    }
}
