import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int val = closedIsland(new int[][]{{0,0,1,1,0,1,0,0,1,0},{1,1,0,1,1,0,1,1,1,0},{1,0,1,1,1,0,0,1,1,0},{0,1,1,0,0,0,0,1,0,1},{0,0,0,0,0,0,1,1,1,0},{0,1,0,1,0,1,0,1,1,1},{1,0,1,0,1,1,0,0,0,1},{1,1,1,1,1,1,0,0,0,0},{1,1,1,0,0,1,0,1,0,1},{1,1,1,0,1,1,0,1,1,0}});
        System.out.println(val);
    }
    public static int[][] mainGrid;
    public static int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}};

    public static int closedIsland(int[][] grid) {
        mainGrid = grid;
        int val = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
//              if(y == 0 || x == 0 || y == grid.length - 1 || x == grid[0].length - 1) return;
                if(grid[i][j] == 0 && i != 0 && j != 0 && i != grid.length - 1 && j != grid[0].length - 1) {
                    edge = false;
                    findIsland(i, j);
                    if (!edge) val++;
                }
            }
        }
        return val;
    }

    public static boolean edge = false;

    public static void findIsland(int y, int x) {
        if(y < 0 || y == mainGrid.length || x < 0 || x == mainGrid[0].length || mainGrid[y][x] != 0) return;
        if(y == 0 || x == 0 || y == mainGrid.length - 1 || x == mainGrid[0].length - 1) edge = true;
        mainGrid[y][x] = 5;
        for (int i = 0; i < directions.length; i++) {
            findIsland(y + directions[i][0], x + directions[i][1]);
        }
    }
}
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class main {
//    public static void main(String[] args) {
//        int val = closedIsland(new int[][]{{0,0,1,1,0,1,0,0,1,0},{1,1,0,1,1,0,1,1,1,0},{1,0,1,1,1,0,0,1,1,0},{0,1,1,0,0,0,0,1,0,1},{0,0,0,0,0,0,1,1,1,0},{0,1,0,1,0,1,0,1,1,1},{1,0,1,0,1,1,0,0,0,1},{1,1,1,1,1,1,0,0,0,0},{1,1,1,0,0,1,0,1,0,1},{1,1,1,0,1,1,0,1,1,0}});
//        System.out.println(val);
//    }
//    public static int closedIsland(int[][] grid) {
//        int val = 0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
////              if(y == 0 || x == 0 || y == grid.length - 1 || x == grid[0].length - 1) return;
//                if(grid[i][j] == 0 && i != 0 && j != 0 && i != grid.length - 1 && j != grid[0].length - 1) {
//                    edge = false;
//                    findIsland(grid, i, j);
//                    if (!edge) val++;
//                }
//            }
//        }
//        return val;
//    }
//
//    public static boolean edge = false;
//
//    public static void findIsland(int[][] grid, int y, int x) {
//        int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}};
//        if(y < 0 || y == grid.length || x < 0 || x == grid[0].length || grid[y][x] != 0) return;
//        if(y == 0 || x == 0 || y == grid.length - 1 || x == grid[0].length - 1) edge = true;
//        grid[y][x] = 5;
//        for (int i = 0; i < directions.length; i++) {
//            findIsland(grid, y + directions[i][0], x + directions[i][1]);
//        }
//    }
//}
