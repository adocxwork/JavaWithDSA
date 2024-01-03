public class p16_findLastIndex {
    static int findLastIndex(int arr[], int n, int target, int idx) //idx=n-1(initially)
    {
        if(idx==-1) return idx;
        if(arr[idx]==target) return idx;
        return findLastIndex(arr, n, target, idx-1);
    }
    public static void main(String[] args) {
        int arr[] = {9,1,8,2,7,2,5};
        int target = 2, n=arr.length;
        System.out.println(findLastIndex(arr, n, target, n-1));
    }
}
