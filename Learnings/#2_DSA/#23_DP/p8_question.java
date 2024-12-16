/*
There are N stones, numbered 1,2,...,N. The height of ith stone is h₁. There is a frog who is initially on Stone 1.
He will repeat an action some number of times to reach Stone N. The action is that if the frog is currently on Stone i,
it jumps to one of the following: Interview Problems On DP... Stone i+1,i+2. Here, a cost of lh - hil is incurred,
where j is the stone to land on. Find the minimum possible total cost incurred before the frog reaches Stone N.

Inputl: n = 5 k = 3
10 30 40 50 20
Outputl: 30

Input2: 31
10 20 10
Output2: 20
*/
import java.util.*;

public class p8_question {
    public static int rec(int i, List<Integer> heights) {
        if(i==0){
            return 0;
        }
        int jump_1 = Math.abs(heights.get(i)-heights.get(i-1)) + rec(i-1, heights);
        int jump_2 = 1000000;
        if(i>1){
            jump_2 = Math.abs(heights.get(i)-heights.get(i-2)) + rec(i-2, heights);
        }
        return Math.min(jump_1, jump_2);
    }
    public static void main(String[] args) {
        List<Integer> heights = List.of(10,30,40,50,20);
    }
}
