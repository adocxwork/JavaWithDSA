public class p3_HeapSort {
    public static void heapify(int arr[], int n, int i){
        int largest = i;
        int leftIdx = 2*i + 1;
        int rightIdx = 2*i + 2;

        if(leftIdx<n && arr[leftIdx] > arr[largest]){
            largest = leftIdx;
        }
        if(rightIdx<n && arr[rightIdx] > arr[largest]){
            largest = rightIdx;
        }

        if(largest!=i){
            // swap arr[largest] & arr[i]
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, n, largest);
        }
    }
    public static void buildHeap(int arr[], int n){ //O(n)
        // last non leaf node index
        int startIdx = n/2 - 1;
        for(int i=startIdx; i>=0; i--){
            heapify(arr, n, i);
        }
    }
    public static void heapSort(int arr[], int n){
        buildHeap(arr, n);
        // heapsort
        for(int i=n-1; i>=0; i--){
            // swap(arr[i], arr[0])
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            // function calling of heapify method
            heapify(arr, i, 0);
        }
    }
    public static void displayHeap(int arr[], int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,4,6,13,10,9,8,15,17};
        int n = arr.length;

        displayHeap(arr, n);
        heapSort(arr, n);
        displayHeap(arr, n);
    }
}
