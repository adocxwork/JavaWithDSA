public class p4_question {
    // find the pivot in a rotated sorted array | O(log n)
    static int findPivot(int arr[]){
        int n = arr.length, st=0, end=n-1, ans=-1;
        while (st<=end) {
            int mid = st + (end-st)/2;
            if(arr[mid]<=arr[n-1]){
                ans = mid;
                end = mid-1;
            } else{
                st = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // int arr[] = {5,6,7,8,9,10,1,2,3,4};
        int arr[] = {3,4,5,1,2};
        System.out.println(findPivot(arr));
    }
}
