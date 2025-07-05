public class p11_question {
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
    static void singleSwapSort(int arr[]){
        int n = arr.length, x=-1, y=-1;
        if(n<=1) return;
        for(int i=1; i<n; i++){
            if(arr[i-1]>arr[i]){
                if(x==-1){
                    x=i-1;
                    y=i;
                }
                else{
                    y=i;
                }
            }
        }
        swap(arr, x, y);
    }
    public static void main(String[] args) {
        int arr[] ={2,8,4,5,6,7,3,9};
        displayArray(arr);
        singleSwapSort(arr);
        displayArray(arr);
    }
}