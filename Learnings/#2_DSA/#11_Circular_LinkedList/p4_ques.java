public class p4_ques {
    public static class Node {
        int val;
        Node prev, next;

        Node(int val) {
            this.val = val;
        }
    }

    public static void display(Node head) {
        Node temp = head.next;
        System.out.print(head.val + " ");
        while (temp != head) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void twoSum(Node head, int target) {
        Node h = head, t = head;
        while (t.next != null) {
            t = t.next;
        }
        while (true) {
            if (h.val + t.val == target) {
                System.out.println(h.val + " " + t.val);
                return;
            } else if (h.val + t.val < target) {
                h = h.next;
            } else {
                t = t.prev;
            }
        }
    }

    public static void main(String[] args) {
        Node ob1 = new Node(1);
        Node ob2 = new Node(3);
        Node ob3 = new Node(5);
        Node ob4 = new Node(7);
        Node ob5 = new Node(11);
        ob1.next = ob2;
        ob2.next = ob3;
        ob3.next = ob4;
        ob4.next = ob5;
        ob2.prev = ob1;
        ob3.prev = ob2;
        ob4.prev = ob3;
        ob5.prev = ob4;

        twoSum(ob1, 10);
        // two sum in a sorted DLL
    }
}
