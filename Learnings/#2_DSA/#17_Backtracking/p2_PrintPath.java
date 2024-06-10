public class p2_PrintPath {
    static void printPath(int sr, int sc, int er, int ec, String s){
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        printPath(sr+1, sc, er, ec, s+"D");
        printPath(sr, sc+1, er, ec, s+"R");
    }
    public static void main(String[] args) {
        int rows=3, cols=3;
        printPath(0,0,rows-1, cols-1, "");
    }
}
