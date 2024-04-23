public class p5_CircularQueueArray {
    public static class cQueueArray{
        int f=-1, r=-1, size=0;
        int arr[] = new int[5];
        public void add(int val) throws Exception { //exception handling
            if(size==arr.length){
                throw new Exception("Queue is full!");
            } else if(size==0){
                f= r = 0;
                arr[0] = val;
            } else if(r<arr.length-1){ //normal case
                arr[++r] = val;
            } else if(r==arr.length-1){
                r = 0;
                arr[0] = val;
            }
            size++;
        }
        public int remove() throws Exception {
            if(size==0){
                throw new Exception("Queue is empty..!");
            } else {
                int val = arr[f];
                if(f==arr.length-1) f=0;
                else f++;
                size--;
                return val;
            }
        }
        public int peek() throws Exception {
            if(size==0){
                throw new Exception("Queue is empty..!");
            }
            else return arr[f];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty..!");
                return;
            } else if(f<=r){
                for(int i=f; i<=r; i++){
                    System.out.print(arr[i] + " ");
                }
            } else {
                for(int i=f; i<arr.length; i++){
                    System.out.print(arr[i] + " ");
                }
                for(int i=0; i<=r; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        cQueueArray q = new cQueueArray();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        q.add(5);
        q.display();
        q.add(6);
        q.display();
        System.out.println("Actual array : ");
        for(int i=0; i<q.arr.length; i++){
            System.out.print(q.arr[i] + " ");
        }
    }
}
