import java.util.Arrays;

public class p1{
    public static class al{
        int arr[] = new int[2];
        int idx=0, size=0;
        public void add(int ele){
            if(size==arr.length){
                int brr[] = Arrays.copyOf(arr, arr.length*2);
                arr = brr;
            }
            arr[idx] = ele;
            idx++;
            size++;
        }
        public void set(int idx, int val){
            arr[idx] = val;
        }
    }
    public static void main(String[] args) {
        al arr = new al();
        arr.add(2);
        arr.add(1);
        System.out.println(arr.size);
        arr.add(5);
        System.out.println(arr.size);
        arr.set(0, 7);
    }
}