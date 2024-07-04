public class p9_MaxKnightsInNxNChessBoard {
    static int maxKnights = -1;
    static int number = 8;

    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        int i, j;
        // up right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && board[i][j] == 'K')
            return false;
        // up left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && board[i][j] == 'K')
            return false;
        // down right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && board[i][j] == 'K')
            return false;
        // down left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && board[i][j] == 'K')
            return false;
        // 2 right 1 up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && board[i][j] == 'K')
            return false;
        // 2 right 1 down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && board[i][j] == 'K')
            return false;
        // 2 left 1 up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && board[i][j] == 'K')
            return false;
        // 2 left 1 down
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && board[i][j] == 'K')
            return false;
        return true;
    }

    static void nKnight(char board[][], int row, int col, int num) {
        int n = board.length;
        if (row == n) { // base case
            if (num == number) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            maxKnights = Math.max(maxKnights, num);
            return;
        } else if (isSafe(board, row, col)) {
            board[row][col] = 'K';
            if (col != n - 1)
                nKnight(board, row, col + 1, num + 1);
            else
                nKnight(board, row + 1, 0, num + 1);
            // backtracking
            board[row][col] = 'x';
        }
        // leave
        if (col != n - 1)
            nKnight(board, row, col + 1, num);
        else
            nKnight(board, row + 1, 0, num);
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nKnight(board, 0, 0, 0);
        System.out.println(maxKnights);
    }
}
