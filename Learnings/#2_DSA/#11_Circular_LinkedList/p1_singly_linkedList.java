public class p1_singly_linkedList{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static void deleteHead(Node head){
        Node temp = head.next;
        while (temp.next!=head) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public static void display(Node head){
        Node temp = head.next;
        System.out.print(head.val + " ");
        while (temp!=head) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node ob1 = new Node(4);
        Node ob2 = new Node(1);
        Node ob3 = new Node(2);
        Node ob4 = new Node(5);
        Node ob5 = new Node(7);
        ob1.next = ob2;
        ob2.next = ob3;
        ob3.next = ob4;
        ob4.next = ob5;
        ob5.next = ob1;
        display(ob3);
        deleteHead(ob4);
        display(ob3);

        // palindrome
        // two sum in a sorted DLL
        // critical points max and min distance in DLL
    }
}