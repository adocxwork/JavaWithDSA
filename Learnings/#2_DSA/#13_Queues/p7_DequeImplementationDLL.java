public class p7_DequeImplementationDLL {
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
            if (size == 0) {
                head = tail = a;
            } else {
                a.next = head;
                head.prev = a;
                head = a;
            }
            size++;
        }

        void insertAtEnd(int val) {
            Node a = new Node(val);
            if (size == 0) {
                head = tail = a;
            } else {
                a.prev = tail;
                tail.next = a;
                tail = a;
            }
            size++;
        }

        void insertAt(int val, int idx) {
            if (idx < 0 || idx > size) {
                System.out.println("Index out of bound..");
                return;
            } else if (idx == 0) {
                insertAtStart(val);
            } else if (idx == size) {
                insertAtEnd(val);
            } else {
                Node t1 = head, t2, a = new Node(val);
                for (int i = 0; i < idx - 1; i++) {
                    t1 = t1.next;
                }
                t2 = t1.next;
                t1.next = a;
                t2.prev = a;
                a.prev = t1;
                a.next = t2;
                size++;
            }
        }

        int removeAtStart() {
            if (size == 0) {
                System.out.println("DLL is empty..!");
                return -1;
            } else {
                int x = head.val;
                head = head.next;
                head.prev = null;
                size--;
                return x;
            }
        }

        int removeAtEnd() {
            if (size == 0) {
                System.out.println("DLL is empty..!");
                return -1;
            } else {
                int x = tail.val;
                tail = tail.prev;
                tail.next = null;
                size--;
                return x;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        boolean isEmpty() {
            if (size == 0)
                return true;
            return false;
        }
    }

    public static class Deque {
        doublyLinkedList dll = new doublyLinkedList();

        void pushAtStart(int val) {
            dll.insertAtStart(val);
        }

        void pushAtEnd(int val) {
            dll.insertAtEnd(val);
        }

        int popAtStart() {
            return dll.removeAtStart();
        }

        int popAtEnd() {
            return dll.removeAtEnd();
        }

        int peekAtStart() {
            if (dll.size > 0)
                return dll.head.val;
            else
                return -1;
        }

        int peekAtEnd() {
            if (dll.size > 0)
                return dll.tail.val;
            else
                return -1;
        }
        boolean isEmpty(){
            return dll.isEmpty();
        }
        int size(){
            return dll.size;
        }
        void display(){
            dll.display();
        }
    }

    public static void main(String[] args) {
        Deque dq = new Deque();
        dq.pushAtStart(1);
        dq.pushAtStart(2);
        dq.pushAtStart(3);
        dq.pushAtStart(4);
        dq.display();
        dq.popAtStart();
        dq.display();
        dq.popAtEnd();
        dq.display();
    }
}