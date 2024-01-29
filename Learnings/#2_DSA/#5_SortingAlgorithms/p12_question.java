public class p12_question {
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
    static void sort(int arr[]){
        int n=arr.length, i=0, j=n-1;
        while (i<j) {
            if(arr[i]>0 && arr[j]<0){
                swap(arr, i, j);
                i++;
                j--;
            }
            if(arr[i]<0){
                i++;
            }
            if(arr[j]>0){
                j--;
            }
        }
    }
    static void partition(int arr[]){
        int l=0, r=arr.length-1;
        while (l<r) {
            while (arr[l]<0) l++;
            while (arr[r]>=0) r--;
            if(l<r){
                swap(arr, l, r);
                l++;
                r--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {19,-20,7,-4,-13,11,-5,3};
        displayArray(arr);
        // sort(arr);
        partition(arr);
        displayArray(arr);
    }
}
