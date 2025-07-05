public class p12_question {
    public static void main(String[] args) {
        String str = "Aditya Is The 714", ans = "";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char t = str.charAt(i);
            if (t >= 'A' && t <= 'Z') {
                ans += (char) (t + 32);
            } else if (t >= 'a' && t <= 'z') {
                ans += (char) (t - 32);
            } else {
                ans += t;
            }
        }
        System.out.println(ans);
    }
}
