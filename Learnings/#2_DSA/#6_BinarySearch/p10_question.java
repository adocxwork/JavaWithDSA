public class p10_question {
    public int findPeakElement(int[] nums) {
        int n = nums.length, st = 0, end = n - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if ((mid==0 || nums[mid - 1] < nums[mid]) && (mid==n-1 || nums[mid] > nums[mid + 1])) {
                return mid;
            } else if (nums[mid] < nums[mid + 1]) {
                st = mid + 1;
            } else if (nums[mid - 1] > nums[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    }
}
