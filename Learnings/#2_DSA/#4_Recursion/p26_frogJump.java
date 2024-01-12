public class p26_frogJump {
    static int minCost(int arr[], int n, int idx)
    {
        if(idx==n-1) return 0;
        int c1 = Math.abs(arr[idx]-arr[idx+1]) + minCost(arr, n, idx+1);
        if(idx==n-2) return c1;
        int c2 = Math.abs(arr[idx]-arr[idx+2]) + minCost(arr, n, idx+2);
        return Math.min(c1,c2);
    }
    public static void main(String[] args) {
        int arr[] = {10,30,40,20};
        System.out.println(minCost(arr, arr.length, 0));
    }
}
