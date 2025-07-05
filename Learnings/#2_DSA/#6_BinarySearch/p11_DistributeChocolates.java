public class p11_DistributeChocolates {
    static boolean isDivisionPossible(int arr[], int m, int maxChoco) {
        int n = arr.length, choco = 0, nos = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxChoco) {
                return false;
            }
            if (arr[i] + choco <= maxChoco) {
                choco += arr[i];
            } else {
                choco = arr[i];
                nos++;
            }
        }
        return nos <= m;
    }

    static int distributeChocolates(int arr[], int m) {
        int ans = -1, st = 1, end = (int) 1e9;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (isDivisionPossible(arr, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 67, 90 };
        int m = 2;
        System.out.println(distributeChocolates(arr, m));
    }
}
