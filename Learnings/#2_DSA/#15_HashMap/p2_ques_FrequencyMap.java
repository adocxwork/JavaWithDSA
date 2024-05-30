import java.util.*;
public class p2_ques_FrequencyMap {
    static int elementWithMaxFrequency(int arr[]){
        int n = arr.length, key=-1, maxFre=-1;
        Map<Integer, Integer> fm = new HashMap<>();
        for(int i=0; i<n; i++){
            if(fm.containsKey(arr[i])){
                fm.put(arr[i], fm.get(arr[i]) + 1);
            } else {
                fm.put(arr[i], 1);
            }
        }
        for(var e : fm.entrySet()){
            if(e.getValue()>maxFre){
                maxFre = e.getValue();
                key = e.getKey();
            }
        }
        // System.out.printf("%d has a frequency of %d.\n", key, maxFre);
        return key;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,1,4,1,4,4,4,4,4,4};
        System.out.println(elementWithMaxFrequency(arr));
    }
}
