public class p7_QuickSort {
    static void swap(int arr[], int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    static void displayArray(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int partition(int arr[], int st, int end){
        int pivot = arr[st]; // choose pivot b/w st & end randomly, for T.C. = O(nlogn)
        int cnt=0;
        for(int i=st+1; i<=end; i++){
            if(arr[i]<=pivot) cnt++;
        }
        int pivotIdx = st + cnt;
        swap(arr, st, pivotIdx);
        int i=st, j=end;
        while(i<pivotIdx && j>pivotIdx){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;
            if(i<pivotIdx && j>pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void quickSort(int arr[], int st, int end){
        if(st>=end) return;
        int pi = partition(arr, st, end);
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);
    }
    public static void main(String[] args) {
        int arr[] = {6,6,3,1,5,5,4};
        displayArray(arr);
        quickSort(arr, 0, arr.length-1);
        displayArray(arr);
    }
}
