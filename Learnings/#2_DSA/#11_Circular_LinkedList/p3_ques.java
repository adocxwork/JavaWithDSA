public class p3_ques {
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
    public static boolean isPalindrome(Node head){
        Node h = head, t = head;
        while (t.next!=null) {
           t = t.next; 
        }
        while (t!=h && t!=null) {
            if(t.val!=h.val){
                return false;
            }
            h = h.next;
            t = t.prev;
        }
        return true;
    }
    public static void main(String[] args) {
        Node ob1 = new Node(4);
        Node ob2 = new Node(1);
        Node ob3 = new Node(2);
        Node ob4 = new Node(1);
        Node ob5 = new Node(4);
        ob1.next = ob2;
        ob2.next = ob3;
        ob3.next = ob4;
        ob4.next = ob5;
        ob2.prev = ob1;
        ob3.prev = ob2;
        ob4.prev = ob3;
        ob5.prev = ob4;

        // check for the palindrome
        System.out.println(isPalindrome(ob1));
    }
}
