public class p6_question {
    // this will also work for duplicate elements
    static int indexInRotatedArrayBS(int arr[], int target){
        int st=0, end=arr.length-1;
        while (st<=end) {
            int mid = st + (end-st)/2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[st] == arr[mid] && arr[mid] == arr[end]){
                st++;
                end--;
            } else if(arr[mid]<=arr[end]){ //mid to end is sorted
                if(target>arr[mid] && target<=arr[end]){
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else{ //st to mid is sorted
                if(target>=arr[st] && target<arr[mid]){
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3,1};
        System.out.println(indexInRotatedArrayBS(arr, 3));
    }
}
