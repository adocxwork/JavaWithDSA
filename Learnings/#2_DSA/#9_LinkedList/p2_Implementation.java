public class p2_Implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null, tail = null;
        int size = 0;

        void insertAtStart(int data) { // O(1)
            Node temp = new Node(data);
            if (head == null) {
                head = tail = temp;
                // add(data); //this also works fine..
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAtEnd(int data) { // O(1) if tail is given
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void insertAtEnd2(int data) { // O(n) if only head is given
            Node temp = head;
            Node newNode = new Node(data);
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            tail = newNode;
            size++;
        }

        void insertAt(int idx, int data) { // O(n)
            Node newNode = new Node(data);
            if (idx < 0 || idx > size()) {
                System.out.println("Invalid index.");
                return;
            } else if (idx == 0) {
                insertAtStart(data);
            } else if (idx == size()) {
                insertAtEnd(data);
            } else {
                int index = 0;
                Node temp = head;
                while (index != idx - 1) {
                    index++;
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
                size++;
            }
        }

        void insertAt2(int idx, int val) { // O(n)
            Node t = new Node(val);
            Node temp = head;
            if (idx == size()) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtStart(val);
                return;
            } else if (idx < 0 || idx > size()) {
                System.out.println("Invalid index.");
                return;
            }
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        void deleteAt(int idx) {
            if (idx == 0) {
                head = head.next;
                size--;
                return;
            } else if (idx == size - 1) {
                Node temp = head;
                for (int i = 1; i <= idx - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                tail = temp;
                size--;
                return;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid index.");
                return;
            }
            Node temp = head;
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }

        int getAt(int idx) { // O(n)
            if (idx < 0 || idx >= size()) {
                System.out.println("Invaild index.");
                return -1;
            }
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() { // O(n)
            // Node temp = head;
            // int count = 0;
            // while (temp != null) {
            // count++;
            // temp = temp.next;
            // }
            // return count;
            return size; // O(1)
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(9);
        ll.insertAtEnd(1);
        ll.insertAtStart(5);
        ll.insertAt(1, 7);
        ll.deleteAt(2);
        ll.display();
        System.out.println("Length : " + ll.size());
        System.out.println("Element at 1 index : " + ll.getAt(1));
        // 5, 7, 1

    }
}