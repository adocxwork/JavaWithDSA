public class p1{
    public static void displayLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayLLRecusively(Node head){ //using recursion
        if(head==null){
            System.out.println();
            return;
        }
        System.out.print(head.data + " ");
        displayLL(head.next);
    }
    public static int length(Node head){
        int count=0;
        while (head!=null) {
            count++;
            head = head.next;
        }
        return count;
    }
    public static class Node{
        int data; //value
        Node next; //address of next node
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node ob1 = new Node(5); //head node
        Node ob2 = new Node(3);
        Node ob3 = new Node(9);

        ob1.next = ob2;
        ob2.next = ob3;
        // ob1 >> ob2 >> ob3


        // Displaying Linked List

        // Noob way to print Linked List...
        // System.out.println(ob1.data);
        // System.out.println(ob1.next.data);
        // System.out.println(ob1.next.next.data);

        // When you know the no. of nodes in a LL
        // Node temp = ob1;
        // for(int i=0; i<3; i++){
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }

        // Much better way..
        // Node temp = ob1;
        // while(temp!=null){
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }
        displayLL(ob1);
        displayLLRecusively(ob1);
        System.out.println(length(ob1));
    }
}