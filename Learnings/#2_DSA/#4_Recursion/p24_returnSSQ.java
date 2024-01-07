import java.util.ArrayList;

public class p24_returnSSQ {
    static ArrayList<String> getSSQ(String s)
    {
        ArrayList<String> ans = new ArrayList<String>();
        if(s.length()==0)
        {
            ans.add("");
            return ans;
        }
        char currChar = s.charAt(0);
        ArrayList<String> smallAns = getSSQ(s.substring(1));
        for(String ss : smallAns)
        {
            ans.add(ss);
            ans.add(currChar + ss);
        }
        return ans;
    }
    static void printSSQ(String s, String currAns)
    {
        if(s.length()==0)
        {
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String rem = s.substring(1);
        printSSQ(rem, currAns+curr);
        printSSQ(rem, currAns);
    }
    public static void main(String[] args) {
        // ArrayList<String> ans = getSSQ("abc");
        // for(String ss : ans)
        // {
        //     System.out.println(ss);
        // }
        printSSQ("abc", "");
    }
}
