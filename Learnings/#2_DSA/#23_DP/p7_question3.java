import java.util.*;

public class p7_question3 {
    public static void main(String[] args) {
        List<Integer> profit = List.of(1,2,3);
        List<Integer> weights = List.of(4,5,1);
        int wt = 4;
        int n = profit.size();
        int dp[][] = new int[n+1][wt+1];

        int prev[] = new int[wt+1];
        int cur[] = new int[wt+1];
        
        // base condition...
        for(int i=0; i<=wt; i++){
            cur[i] = 0;
            if(weights.get(0)<=i)
            prev[i] = profit.get(0);
            else
            prev[i] = 0;
        }
        
        for(int idx=1; idx<n; idx++){
            for(int w=0; w<=wt; w++){
                int pick = 0;
                if(w>=weights.get(idx)){
                    pick = profit.get(idx) + prev[w-weights.get(idx)];
                }
                int notPick = prev[w];
                cur[w] = Math.max(pick, notPick);
            }
            prev = cur.clone(); // deep copy
        }

        System.out.println(prev[wt]);
    }
}
