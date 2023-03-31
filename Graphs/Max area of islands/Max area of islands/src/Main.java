public class Main {
    public static void main(String[] args) {
        int[][]grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
//        int[][]grid = {{0,0,0,0,0,0,0,0}};

        System.out.println(maxAreaOfIsland(grid));
    }

    public static int directions[][] = {{-1,0}, {1,0}, {0,1}, {0,-1}};
    public static int maxAreaOfIsland(int[][] grid) {
        int maxNum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    int islandNum = islands(grid, i, j);
                    if(islandNum > maxNum) {
                        maxNum = islandNum;
                    }
                }
            }
        }
        return maxNum;
    }
    public static int islands(int[][] grid, int y, int x) {
        int sum = 0;
        if(x < 0 || x == grid[0].length || y < 0 || y == grid.length || grid[y][x] == 0) {
            return 0;
        }
        grid[y][x] = 0;
        for (int i = 0; i < directions.length; i++) {
            sum += islands(grid, y + directions[i][0], x + directions[i][1]);
        }
        sum++;
        return sum;
    }
}
