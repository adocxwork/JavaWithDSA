public class p5_ques_intersection {
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
    public static Node intersection(Node head1, Node head2){ //worst code
        Node temp1 = head1, temp2 = head2;
        while (temp1.data!=temp2.data) {
            temp1 = temp1.next;
            if(temp1==null){
                temp1 = head1;
                temp2 = temp2.next;
            }
        }
        return temp1;
    }
    public static Node intersection2(Node head1, Node head2){ //better code
        Node temp1 = head1, temp2 = head2;
        int s1 = size(head1), s2 = size(head2);
        if(s1>s2){
            for(int i=1; i<=(s1-s2); i++){
                temp1 = temp1.next;
            }
        } else {
            for(int i=1; i<=(s2-s1); i++){
                temp2 = temp2.next;
            }
        }
        while (temp1!=temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
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

        Node oob1 = new Node(90);
        Node oob2 = new Node(9);
        oob1.next = oob2;
        oob2.next = ob4;
        display(ob1);
        display(oob1);
        display(intersection(ob1, oob1));
        display(intersection2(ob1, oob1));
    }
}
