public class p1_BinarySearch{
    static int binarySearch(int arr[], int target){ //returns index of target in array
        int st=0, end=arr.length-1;
        while (st<=end) {
            int mid=(st+end)/2;
            if(arr[mid]==target){
                return mid;
            } else if(arr[mid]<target){
                st=mid+1;
            } else{
                end=mid-1;
            }
        }
        return -1;
    }
    static int recursiveBinarySearch(int arr[], int st, int end, int target){
        if(st>end){ //base case
            return -1;
        }
        int mid=(st+end)/2;
        if(arr[mid]==target){
            return mid;
        } else if(arr[mid]<target){
            return recursiveBinarySearch(arr, mid+1, end, target); //sub-problems
        } else{
            return recursiveBinarySearch(arr, st, mid-1, target); //sub-problems
        }
    }
    static boolean binarySearch2(int arr[], int target){ //returns true if target is present in array
        int st=0, end=arr.length-1;
        while (st<=end) {
            int mid=(st+end)/2;
            if(arr[mid]==target){
                return true;
            } else if(arr[mid]<target){
                st=mid+1;
            } else{
                end=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,7,9,10,11,17};
        // System.out.printf("%d is present : %b\n", i, binarySearch2(arr, i));
        for(int i=0; i<=20; i++)
        System.out.println("Index of " + i + " is " + recursiveBinarySearch(arr, 0, arr.length-1, i) + " : " + binarySearch(arr, i));
    }
}