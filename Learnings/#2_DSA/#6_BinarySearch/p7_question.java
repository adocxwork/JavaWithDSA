public class p7_question {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length, st = 0, end = (m * n) - 1;
        while (st <= end) {
            int mid = (st + (end - st) / 2), midEle = matrix[(mid / m)][(mid % m)];
            if (midEle == target) {
                return true;
            } else if (midEle > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // c
    }
}
