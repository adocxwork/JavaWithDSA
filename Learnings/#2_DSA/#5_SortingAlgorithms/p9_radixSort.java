public class p9_radixSort {
    static void displayArray(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int maxEle(int arr[]){
        int m = Integer.MIN_VALUE, n=arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]>m) m = arr[i];
        }
        return m;
    }
    static void countSort(int arr[], int place){ //modified for radixSort
        int n=arr.length;
        int output[] = new int[n];
        int f[] = new int[10];
        for(int i=0; i<n; i++){
            f[(arr[i]/place)%10]++;
        }
        for(int i=1; i<10; i++){
            f[i] += f[i-1];
        }

        for(int i=n-1; i>=0; i--){
            int idx = f[(arr[i]/place)%10]-1;
            output[idx] = arr[i];
            f[(arr[i]/place)%10]--;
        }
        for(int i=0; i<n; i++){
            arr[i] = output[i];
        }
    }
    static void radixSort(int arr[]){
        int max = maxEle(arr);
        for(int place=1; max/place>0; place*=10){
            countSort(arr, place);
        }
    }
    public static void main(String[] args) {
        int arr[] = {43, 453, 626, 894, 0, 3};
        displayArray(arr);
        radixSort(arr);
        displayArray(arr);
    }
}
