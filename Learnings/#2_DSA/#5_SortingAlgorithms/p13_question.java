public class p13_question {
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
    static void duchNationalFlagSort(int arr[]){ //sorts 0,1,2s...
        int lo=0, mid=0, hi=arr.length-1;
        while (mid<=hi) {
            if(arr[mid]==0){
                swap(arr, mid, lo);
                mid++;
                lo++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else {
                swap(arr, mid, hi);
                hi--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,1,1,2,2,0,0,1,1,2,2,0,1};
        displayArray(arr);
        duchNationalFlagSort(arr);
        displayArray(arr);
    }
}