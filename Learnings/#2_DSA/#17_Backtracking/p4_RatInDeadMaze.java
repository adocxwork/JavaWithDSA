public class p4_RatInDeadMaze {
    // only for down and right directions
    static void printPath(int sr, int sc, int er, int ec, String s, int[][] maze){
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return;
        printPath(sr+1, sc, er, ec, s+"D", maze);
        printPath(sr, sc+1, er, ec, s+"R", maze);
    }
    public static void main(String[] args) {
        int rows=3, cols=4;
        int maze[][] = {
            {1,0,1,1},
            {1,1,1,1},
            {1,1,0,1}
        };
        printPath(0,0,rows-1, cols-1, "", maze);
    }
}
