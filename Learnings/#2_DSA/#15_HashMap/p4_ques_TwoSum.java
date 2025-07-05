import java.util.*;

public class p4_ques_TwoSum {
    static int[] twoSum(int nums[], int target){
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int n2 = target - nums[i];
            if (mp.containsKey(n2)) {
                return new int[] { i, mp.get(n2) };
            } else {
                mp.put(nums[i], i);
            }
        }
        return new int[] { -1, -1 };
    }
    public static void main(String[] args) {
        // c
    }
}
