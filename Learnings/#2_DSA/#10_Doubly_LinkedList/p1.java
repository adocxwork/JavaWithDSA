public class p1{
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void displayHead(Node head){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayRev(Node Tail){
        Node temp = Tail;
        while (temp!=null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display(Node n){
        Node temp = n;
        while (temp.prev!=null) {
            temp = temp.prev;
        }
        while (temp!=null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node insertAtHead(Node head, int val){
        Node t = new Node(val);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }
    public static void insertAtTail(Node head, int val){
        Node t = new Node(val);
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = t;
        t.prev = temp;
    }
    public static void insertAt(Node head, int idx, int val){
        Node t = new Node(val);
        Node temp = head;
        for(int i=1; i<=idx-1; i++){
            temp = temp.next;
        }
        t.next = temp.next;
        t.prev = temp;
        temp.next.prev = t;
        temp.next = t;
    }
    public static void deleteAt(Node head, int idx){
        Node s = head;
        for(int i=1; i<=idx-1; i++){
            s = s.next;
        }
        Node r = s.next.next;
        s.next = r;
        r.prev = s;
    }
    public static void main(String[] args) {
        Node ob1 = new Node(4);
        Node ob2 = new Node(10);
        Node ob3 = new Node(2);
        Node ob4 = new Node(99);
        Node ob5 = new Node(13);
        ob1.next = ob2;
        ob2.prev = ob1;
        ob2.next = ob3;
        ob3.prev = ob2;
        ob3.next = ob4;
        ob4.prev = ob3;
        ob4.next = ob5;
        ob5.prev = ob4;
        // 4 10 2 99 13
        // 4 10 2 7 99 13 90

        // displayHead(ob1);
        // displayRev(ob5);
        display(ob3);
        // Node newNode = insertAtHead(ob1, 9);
        insertAtTail(ob1, 90);
        insertAt(ob1, 3, 7);
        display(ob1);
        deleteAt(ob1, 3);
        display(ob1);
    }
}