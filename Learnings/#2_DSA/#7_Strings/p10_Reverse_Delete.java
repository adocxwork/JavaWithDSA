public class p10_Reverse_Delete {
    static void reverseStringBuilder(StringBuilder str){
        int i=0, j = str.length()-1;
        while (i<j) {
            char a = str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, a);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);
        str.reverse();
        // reverseStringBuilder(str);
        System.out.println(str);
        str.delete(1, 3);
        System.out.println(str);
    }
}
