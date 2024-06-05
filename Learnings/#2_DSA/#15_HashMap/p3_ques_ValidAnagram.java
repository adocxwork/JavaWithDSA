import java.util.*;

public class p3_ques_ValidAnagram {
    static HashMap<Character, Integer> makeFreqMap(String s) {
        int n = s.length();
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(s.charAt(i))) {
                mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
            } else {
                mp.put(s.charAt(i), 1);
            }
        }
        return mp;
    }

    // static boolean isAnagram(String s, String t){
    // if(s.length()!=t.length()) return false;
    // HashMap<Character, Integer> mp1 = makeFreqMap(s);
    // HashMap<Character, Integer> mp2 = makeFreqMap(t);
    // return mp1.equals(mp2);
    // }
    static boolean isAnagram(String s, String t) {
        int sl = s.length(), tl = t.length();
        if (sl != tl)
            return false;
        HashMap<Character, Integer> mp = makeFreqMap(s);
        for (int i = 0; i < tl; i++) {
            Character ch = t.charAt(i);
            if (mp.containsKey(ch)) {
                mp.put(ch, mp.get(ch) - 1);
            } else {
                return false;
            }
        }
        for (var e : mp.entrySet()) {
            if (e.getValue() != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // c
    }
}
