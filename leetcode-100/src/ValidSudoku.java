import java.util.*;

public class ValidSudoku {
    public static void main(String[] args) {
//        System.out.println(isValidSudoku(new char[][]{
//                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
//                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
//                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
//                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
//                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
//                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
//                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
//                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
//                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
//        }));
//        System.out.println(isValidSudoku(new char[][]{
//                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
//                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
//                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
//                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
//                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
//                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
//                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
//                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
//                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
//        }));
        System.out.println(isValidSudoku(new char[][]{
                {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
                {'.', '.', '4', '.', '.', '.', '.', '.', '.'}
        }));
    }
//    Solution: Search in matrices with 3x3
    public static Map<Character, ArrayList<int[]>> map = new HashMap<>();
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i+=3) {
            for (int j = 0; j < board[0].length; j+=3) {
                if(!checkTriplete(board, i, j)) return false;
            }
        }
        return true;
    }
    public static boolean checkTriplete(char[][] board, int y, int x) {
        for (int i = y; i < y + 3; i++) {
            for (int j = x; j < x + 3; j++) {
                if(board[i][j] != '.' && map.get(board[i][j]) != null) {
                    for (int k = 0; k < map.get(board[i][j]).size(); k++) {
                        int[] ls = map.get(board[i][j]).get(k);
                        if(ls[0] == i || ls[1] == j || ((ls[0] <= y + 3 && ls[0] >= y) && (ls[1] <= x + 3 && ls[1] >= x))) return false;
                    }
                    map.get(board[i][j]).add(new int[]{i,j});
                } else if(board[i][j] != '.' && map.get(board[i][j]) == null) {
                    map.put(board[i][j], new ArrayList<>());
                    map.get(board[i][j]).add(new int[]{i,j});
                }
            }
        }
        return true;
    }
}
