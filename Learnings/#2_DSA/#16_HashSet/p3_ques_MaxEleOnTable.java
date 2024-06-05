import java.util.HashSet;

public class p3_ques_MaxEleOnTable {
    static int maxNumberOnTable(int bag[]){
        int n = bag.length, max=0;
        HashSet<Integer> table = new HashSet<>();
        for(int i=0; i<n; i++){
            int num = bag[i];
            if(table.contains(num)){
                table.remove(num);
            } else {
                table.add(num);
                max = Math.max(max, table.size());
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {2,1,1,3,2,3};
        System.out.println(maxNumberOnTable(nums));
    }
}
