public class p12_RaceTrack {
    static boolean isMinDistancePossible(int arr[], int k, int minDist) {
        int n = arr.length, kidsPlaced = 1, lastKid = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]-lastKid>=minDist){
                kidsPlaced++;
                lastKid = arr[i];
            }
        }
        return kidsPlaced >= k;
    }

    static int raceTrack(int arr[], int nok) {
        int ans = -1, st = 0, end = (int) 1e9;
        if(nok>arr.length) return -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (isMinDistancePossible(arr, nok, mid)) {
                ans = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 8, 9 };
        int nok = 3;
        System.out.println(raceTrack(arr, nok));
    }
}
