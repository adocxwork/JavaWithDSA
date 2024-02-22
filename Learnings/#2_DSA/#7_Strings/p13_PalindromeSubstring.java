public class p13_PalindromeSubstring {
    static boolean palindromeCheck(String str){
        int i=0, j=str.length()-1;
        while (i<j) {
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "abbd";
        int len = str.length(), count=0;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<=len; j++){
                if(palindromeCheck(str.substring(i, j))){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
