import java.util.*;
public class p1_Heap{
    public static void swap(List<Integer> heap, int l, int r){
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }
    public static void pushup_in_minHeap(List<Integer> heap, int index){
        int parent_index = (index - 1)/2;
        if(index == 0 || heap.get(parent_index) < heap.get(index)) {
            return;
        }
        swap(heap, index, parent_index);
        pushup_in_minHeap(heap, parent_index);
    }
    public static void insert_in_MinHeap(List<Integer> heap, int element){
        // last mai add
        heap.add(element);
        int index = heap.size() - 1;
        pushup_in_minHeap(heap, index);
    }
    public static void pushup_in_maxHeap(List<Integer> heap, int index){
        int parent_index = (index - 1)/2;
        if(index == 0 || heap.get(parent_index) > heap.get(index)) {
            return;
        }
        swap(heap, index, parent_index);
        pushup_in_maxHeap(heap, parent_index);
    }
    public static void insert_in_MaxHeap(List<Integer> heap, int element){
        // last mai add
        heap.add(element);
        int index = heap.size() - 1;
        pushup_in_maxHeap(heap, index);
    }

    
    // for deletion in a min heap (top element)
    public static void pushdown_in_MinHeap(List<Integer> heap, int index){
        int n = heap.size()-1;
        if(index==n){
            return;
        }
        int left = (2*index) + 1;
        int right = (2*index) + 2;
        int smallest = index;
        if(left<=n && heap.get(left)<heap.get(smallest)){
            smallest = left;
        }
        if(right<=n && heap.get(right)<heap.get(smallest)){
            smallest = right;
        }
        if(smallest == index) {
            return;
        }
        swap(heap,index ,smallest);
        pushdown_in_MinHeap(heap, smallest);
    }
    public static void deleteFromMinHeap(List<Integer> heap){
        swap(heap, 0, heap.size()-1);
        heap.remove(heap.size()-1);
        pushdown_in_MinHeap(heap, 0);
    }

    // for deletion in a max heap (top element)
    public static void pushdown_in_MaxHeap(List<Integer> heap, int index){
        int n = heap.size()-1;
        if(index==n){
            return;
        }
        int left = (2*index) + 1;
        int right = (2*index) + 2;
        int greatest = index;
        if(left<=n && heap.get(left)>heap.get(greatest)){
            greatest = left;
        }
        if(right<=n && heap.get(right)>heap.get(greatest)){
            greatest = right;
        }
        if(greatest == index) {
            return;
        }
        swap(heap,index ,greatest);
        pushdown_in_MaxHeap(heap, greatest);
    }
    public static void deleteFromMaxHeap(List<Integer> heap){
        swap(heap, 0, heap.size()-1);
        heap.remove(heap.size()-1);
        pushdown_in_MaxHeap(heap, 0);
    }

    // build a heap
    public static void heapify(List<Integer> arr){
        int first_non_leaf_node = ((arr.size()-1)-1)/2; //last element ka parent
        for(int i=first_non_leaf_node; i>=0; i--){
            pushdown_in_MinHeap(arr, i);
        }
    }

    public static void heapSort(List<Integer> arr){
        // convert into min heap
        heapify(arr);
        int n = arr.size()-1;
        for(int i=n; i>0; i--){
            swap(arr, 0, i);
            pushdown_in_MinHeap(arr, i-1);
        }
    }
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(90);
        heap.add(80);
        heap.add(70);
        heap.add(20);
        heap.add(10);
        heap.add(50);
        heap.add(60);
        System.out.println(heap);
        // insert_in_MinHeap(heap, 5);
        // deleteFromMinHeap(heap);
        heapSort(heap);
        System.out.println(heap);
    }
}