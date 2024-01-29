public class p2_question {
    static int firstOccurrenceBS(int arr[], int x){
        int st=0, end=arr.length-1;
        while (st<=end) {
            int mid = st + (end-st)/2;
            if(arr[mid]==x){
                for(int i=mid; i>0; i--){ //method thoda linear hai :-(
                    if(arr[i-1]!=arr[i]){
                        return i;
                    }
                }
                return 0;
            } else if(arr[mid]<x){
                st=mid+1;
            } else{
                end=mid-1;
            }
        }
        return -1;
    }
    static int firstOccurrenceBS2(int arr[], int x){
        int st=0, end=arr.length-1, fo=-1;
        while (st<=end) {
            int mid = st + (end-st)/2;
            if(arr[mid]==x){
                fo=mid;
                end=mid-1;
            } else if(arr[mid]<x){
                st=mid+1;
            } else{
                end=mid-1;
            }
        }
        return fo;
    }
    static int lastOccurrenceBS(int arr[], int x){
        int st=0, end=arr.length-1, fo=-1;
        while (st<=end) {
            int mid = st + (end-st)/2;
            if(arr[mid]==x){
                fo=mid;
                st=mid+1;
            } else if(arr[mid]<x){
                st=mid+1;
            } else{
                end=mid-1;
            }
        }
        return fo;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,5,5,6,6,8,9,9,9}, x=5;
        System.out.println(firstOccurrenceBS2(arr, x));
        System.out.println(lastOccurrenceBS(arr, x));

        // also find the last occurence
    }
}
