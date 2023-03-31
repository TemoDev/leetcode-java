import java.util.Arrays;

public class SurroundedRegions {
    public static void main(String[] args) {
        solve(new char[][]{{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}});

    }
    public static int[][] directions = {{1,0}, {0,1}, {-1,0}, {0,-1}};
    public static void solve(char[][] board) {
        int nRows = board.length;
        int nCols = board[0].length;

        for (int i = 0; i < nCols; i++) {
            if (board[0][i] == 'O') dfs(board, 0, i);
            if (board[nRows - 1][i] == 'O') dfs(board, nRows - 1, i);
        }

        for (int i = 0; i < nRows; i++) {
            if (board[i][0] == 'O') dfs(board, i, 0);
            if (board[i][nCols - 1] == 'O') dfs(board, i, nCols - 1);
        }

        for (int r = 0; r < nRows; r++) {
            for (int c = 0; c < nCols; c++) {
                if (board[r][c] == 'O') board[r][c] = 'X';
                if (board[r][c] == 'T') board[r][c] = 'O';
            }
        }

        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }

    }
    public static void dfs(char[][] board, int r, int c) {
        int nRows = board.length;
        int nCols = board[0].length;
        if (
                r < 0 || c < 0 || r >= nRows || c >= nCols || board[r][c] != 'O'
        ) return;

        board[r][c] = 'T';
        for (int i = 0; i < directions.length; i++) {
            dfs(board, r + directions[i][0], c + directions[i][1]);
        }
    }
}
