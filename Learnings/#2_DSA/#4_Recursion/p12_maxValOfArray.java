public class p12_maxValOfArray {
    static int maxx(int a, int b)
    {
        if(a>b) return a;
        return b;
    }
    static int maxValRec(int arr[], int idx) //best recursive method
    {
        if(idx==arr.length-1) return arr[idx];
        return maxx(arr[idx], maxValRec(arr, idx+1));
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,0,9,4};
        System.out.println(maxValRec(arr, 0));
    }
}
