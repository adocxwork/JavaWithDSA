import java.util.*;

public class p9_question3 {
    public static void main(String[] args) {
        List<Integer> heights = List.of(10, 30, 40, 50, 20);
        int k = 3, n = heights.size();
        List<Integer> dp = new ArrayList<>();
        dp.add(0);
        for (int i = 1; i < n; i++) {
            int minCost = 1000000;
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = Math.abs(heights.get(i) - heights.get(i - j)) + dp.get(dp.size()- j);
                    minCost = Math.min(minCost, jump);
                }
            }
            if(dp.size()==k){
                dp.remove(0);
            }
            dp.add(minCost);
        }
        System.out.println(dp.get(k - 1));
    }
}
