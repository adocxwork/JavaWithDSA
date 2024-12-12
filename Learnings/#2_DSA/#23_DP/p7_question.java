import java.util.*;

public class p7_question {
    public static int rec(int idx, int w, List<Integer> profit, List<Integer> weights) {
        if(idx==0){
            if(weights.get(0)<=w){
                return profit.get(0);
            } else{
                return 0;
            }
        }
        int pick = 0;
        if(w>=weights.get(idx)){
            pick = profit.get(idx) + rec(idx-1, w-weights.get(idx), profit, weights);
        }
        int notPick = rec(idx-1, w, profit, weights);
        return Math.max(pick, notPick);
    }
    public static void main(String[] args) {
        List<Integer> profit = List.of(1,2,3);
        List<Integer> weights = List.of(4,5,1);
        int w = 4;
        int n = profit.size();
        System.out.println(rec(n-1, w, profit, weights));
    }
}
