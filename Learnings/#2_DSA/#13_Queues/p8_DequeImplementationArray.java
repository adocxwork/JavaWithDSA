public class p8_DequeImplementationArray {
    public static class DequeArray {
        int arr[] = new int[5];
        int n = arr.length;
        int f = n / 2, r = n / 2, size = 0;

        void pushAtStart(int val) {
            if (size == 0) {
                arr[f] = val;
                size++;
            } else if (f > 0) {
                arr[--f] = val;
                size++;
            } else {
                System.out.println("Size is full..");
            }
        }

        void pushAtEnd(int val) {
            if (size == 0) {
                arr[f] = val;
                size++;
            } else if (r < n - 1) {
                arr[++r] = val;
                size++;
            } else {
                System.out.println("Size is full..");
            }
        }

        int popAtStart() {
            if (size > 0 && f <= r) {
                size--;
                return arr[f++];
            } else {
                System.out.println("Underflow..");
                return -1;
            }
        }
        
        int popAtEnd() {
            if (size > 0 && f <= r) {
                size--;
                return arr[r--];
            } else {
                System.out.println("Underflow..");
                return -1;
            }
        }
        int peekAtStart(){
            if (size > 0 && f <= r) {
                return arr[f];
            } else {
                System.out.println("Underflow..");
                return -1;
            }
        }
        int peekAtEnd(){
            if (size > 0 && f <= r) {
                return arr[r];
            } else {
                System.out.println("Underflow..");
                return -1;
            }
        }
        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
        int size(){
            return size;
        }
        void display(){
            for(int i=f; i<=r; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DequeArray da = new DequeArray();
        da.pushAtEnd(1);
        da.pushAtEnd(2);
        da.pushAtEnd(3);
        da.pushAtStart(4);
        da.display();
    }
}
