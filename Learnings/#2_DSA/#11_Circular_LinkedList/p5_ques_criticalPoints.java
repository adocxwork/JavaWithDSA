public class p5_ques_criticalPoints {
    public static class Node{
        int val;
        Node prev, next;
        Node(int val){
            this.val = val;
        }
    }
    public static int countDis(Node left, Node right){
        int len = 0;
        while(left != right){
            left = left.next;
            len++;
        }
        return len;
    }
    public static int minDisFromCriticalPoints(Node head){
        int len = Integer.MAX_VALUE;
        Node s = head.next, r = head.next;
        while (s.next!=null) {
            if((s.prev.val>s.val && s.val<s.next.val) || (s.prev.val<s.val && s.val>s.next.val)){
                if(len>countDis(r, s)){
                    len = countDis(r, s);
                }
                r = s;
            }
            s = s.next;
        }
        return len;
    }
    public static int maxDisFromCriticalPoints(Node head){
        int len = Integer.MIN_VALUE;
        Node s = head.next, r = head.next;
        while (s.next!=null) {
            if((s.prev.val>s.val && s.val<s.next.val) || (s.prev.val<s.val && s.val>s.next.val)){
                if(len<countDis(r, s)){
                    len = countDis(r, s);
                }
                r = s;
            }
            s = s.next;
        }
        return len;
    }
    public static void main(String[] args) {
        // critical points max and min distance in DLL
        Node ob1 = new Node(1);
        Node ob2 = new Node(2);
        Node ob3 = new Node(2);
        Node ob4 = new Node(3);
        Node ob5 = new Node(7);
        Node ob6 = new Node(4);
        Node ob7 = new Node(1);
        Node ob8 = new Node(2);
        ob1.next = ob2;
        ob2.next = ob3;
        ob3.next = ob4;
        ob4.next = ob5;
        ob5.next = ob6;
        ob6.next = ob7;
        ob7.next = ob8;
        ob8.prev = ob7;
        ob7.prev = ob6;
        ob6.prev = ob5;
        ob5.prev = ob4;
        ob4.prev = ob3;
        ob3.prev = ob2;
        ob2.prev = ob1;
        // 1 2 0 3 7 4 1 2
        System.out.println(minDisFromCriticalPoints(ob1));
        System.out.println(maxDisFromCriticalPoints(ob1));
    }
}
