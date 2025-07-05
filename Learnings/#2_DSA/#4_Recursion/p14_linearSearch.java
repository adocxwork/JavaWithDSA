import java.util.ArrayList;

public class p14_linearSearch {
    static boolean linearSearch(int arr[], int x, int idx)
    {
        if(idx==arr.length) return false;
        if(arr[idx]==x) return true;
        return linearSearch(arr, x, idx+1);
    }
    static int linearSearchIndex(int arr[], int n, int target, int idx) //returns index
    {
        if(idx==n) return -1;
        if(arr[idx]==target) return idx;
        return linearSearchIndex(arr, n, target, idx+1);
    }
    static void findAllIndices(int arr[], int n, int x, int idx)
    {
        if(idx==n) return;
        if(arr[idx]==x) System.out.println(idx);
        findAllIndices(arr, n, x, idx+1);
    }
    static ArrayList<Integer> allIndices(int a[], int n, int target, int idx) //returns ArrayList
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(idx==n) return ans;
        if(a[idx]==target) ans.add(idx);
        ArrayList<Integer> smallAns = allIndices(a, n, target, idx+1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {9,2,5,7,1,4,3,7,2};
        int len = arr.length;
        ArrayList<Integer> ans = allIndices(arr, len, 7, 0);
        for(Integer i : ans)
        {
            System.out.println(i);
        }
    }
}
