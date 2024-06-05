import java.util.*;
public class p4_ques_Isomorphic {
    static boolean isIsomorphic(String s, String t){
        int sl = s.length(), tl = t.length();
        if(sl!=tl) return false;
        HashMap<Character, Character> mp = new HashMap<>();
        HashSet<Character> st = new HashSet<>();
        for(int i=0; i<sl; i++){
            char sch = s.charAt(i), tch = t.charAt(i);
            if(mp.containsKey(sch)){
                if(mp.get(sch)!=tch) return false;
            } else if(st.contains(tch)){
                return false;
            } else {
                mp.put(sch, tch);
                st.add(tch);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("ho");
    }
}
