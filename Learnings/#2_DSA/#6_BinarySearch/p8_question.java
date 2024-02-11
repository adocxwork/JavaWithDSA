public class p8_question {
    public boolean searchMatrix(int[][] arr, int t) {
        int r = arr.length, c = arr[0].length, i = 0, j = c - 1;
        while (i < r && j >= 0) {
            if (arr[i][j] == t) {
                return true;
            }
            if (arr[i][j] > t) {
                j--;
            } else if (arr[i][j] < t) {
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // cc
    }
}
