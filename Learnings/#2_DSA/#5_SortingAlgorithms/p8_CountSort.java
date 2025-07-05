public class p8_CountSort {
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
    static void basicCountSort(int arr[]){ //Unstable algo
        int max=maxEle(arr), n=arr.length, p=0;
        int f[] = new int[max+1];
        for(int i=0; i<n; i++){
            f[arr[i]]++;
        }
        for(int i=0; i<=max; i++){
            for(int j=0; j<f[i]; j++){
                arr[p++] = i;
            }
        }
    }
    static void countSort(int arr[]){
        int max = maxEle(arr), n=arr.length;
        int f[] = new int[max+1];
        int output[] = new int[n];
        for(int i=0; i<n; i++){
            f[arr[i]]++;
        }
        for(int i=1; i<=max; i++){
            f[i] += f[i-1];
        }

        for(int i=n-1; i>=0; i--){
            int idx = f[arr[i]]-1;
            output[idx] = arr[i];
            f[arr[i]]--;
        }
        for(int i=0; i<n; i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,1,8,2,8,2,4,5};
        displayArray(arr);
        countSort(arr);
        displayArray(arr);
    }
}
