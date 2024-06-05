import java.util.*;;
public class p5_ques_LargestSubarray {
    static int zeroSumLargestSubArray(int arr[], int n){
        int maxLen=0, preSum=0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0,-1); //intentionally
        for(int i=0; i<arr.length; i++){
            preSum += arr[i];
            if(mp.containsKey(preSum)){
                maxLen = Math.max(maxLen, i-mp.get(preSum));
            } else {
                mp.put(preSum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        // c
    }
}
