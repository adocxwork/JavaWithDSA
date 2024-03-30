public class p2_Implementation_DLL {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    public static class doublyLinkedList {
        Node head = null, tail = null;
        int size = 0;

        void insertAtStart(int val) {
            Node a = new Node(val);
            if (head == null) {
                head = tail = a;
                size++;
                return;
            }
            a.next = head;
            head = a;
            size++;
        }

        void insertAtEnd(int val) {
            Node a = new Node(val);
            if (tail == null) {
                head = tail = a;
                size++;
                return;
            }
            tail.next = a;
            tail = a;
            size++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // we can add soo many functionalities to this doublyLinkedList class
        // like we did in previous linkedlist class implementation...
    }

    public static void main(String[] args) {
        doublyLinkedList d = new doublyLinkedList();
        d.insertAtStart(2);
        d.insertAtStart(3);
        d.insertAtEnd(5);
        d.insertAtEnd(7);
        d.display();
        System.out.println(d.size);
    }
}
