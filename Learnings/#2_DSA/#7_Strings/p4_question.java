public class p4_question {
    public static void main(String[] args) {
        // given a string s, print all the substring of s.
        String s = "abcd";
        int len = s.length();
        for(int i=0; i<len; i++){
            for(int j=i+1; j<=len; j++){
                System.out.println(s.substring(i, j));
            }
        }
    }
}
