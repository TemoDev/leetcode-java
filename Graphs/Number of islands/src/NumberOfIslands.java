import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Never give up = recursion

public class NumberOfIslands {

    public static void main(String[] args) {
        char[][] grid = {
            {'1', '0'},
            {'1', '1'},
        }; // output 1
//        char[][] grid = {
//            {'1', '1', '1', '1', '0'},
//            {'1', '1', '0', '1', '0'},
//            {'1', '1', '0', '0', '0'},
//            {'0', '0', '0', '0', '0'}
//        }; // output 1
//        char[][] grid = {
//                {'1', '1', '0', '0', '0'},
//                {'1', '1', '0', '0', '0'},
//                {'0', '0', '1', '0', '0'},
//                {'0', '0', '0', '1', '1'}
//        }; // output 3
        System.out.println(numIslands(grid));;
    }


    public static int[][] directions = {{-1,0}, {1,0}, {0,1}, {0, -1}};

    public static int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    count++;
                    bfs(grid, i, j);
                }
            }
        }
        return count;
    }

    public static void bfs(char[][] grid, int y, int x) {
        if(y < 0 || y >= grid.length || x < 0 || x >= grid[0].length || grid[y][x] == '0') {
            return;
        }
        for (int i = 0; i < directions.length; i++) {
            grid[y][x] = '0';
            bfs(grid, y + directions[i][0], x + directions[i][1]);
        }
    }

}

























