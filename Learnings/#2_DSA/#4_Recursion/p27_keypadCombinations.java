public class p27_keypadCombinations {
    static void combinations(String s, String map[], String currAns)
    {
        if(s.length()==0)
        {
            System.out.print(currAns + " ");
            return;
        }
        int currNum = s.charAt(0) - '0';
        String remChoices = map[currNum];
        for(int i=0; i<remChoices.length(); i++)
        {
            combinations(s.substring(1), map, currAns + remChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        String map[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "tuv", "wxyz"};
        combinations("23", map, "");
    }
}