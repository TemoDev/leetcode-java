//public boolean edge = false;
//public int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}};
//public int closedIsland(int[][] grid) {
//        int val = 0;
//        for (int i = 0; i < grid.length; i++) {
//        for (int j = 0; j < grid[0].length; j++) {
////              if(y == 0 || x == 0 || y == grid.length - 1 || x == grid[0].length - 1) return;
//        if(grid[i][j] == 0 && i != 0 && j != 0 && i != grid.length - 1 && j != grid[0].length - 1) {
//        edge = false;
//        findIsland(grid, i, j);
//        if (!edge) val++;
//        }
//        }
//        }
//        return val;
//        }
//
//
//public void findIsland(int[][] grid, int y, int x) {
//        if(y < 0 || y == grid.length || x < 0 || x == grid[0].length || grid[y][x] != 0) return;
//        if(y == 0 || x == 0 || y == grid.length - 1 || x == grid[0].length - 1) edge = true;
//        grid[y][x] = 5;
//        for (int i = 0; i < directions.length; i++) {
//        findIsland(grid, y + directions[i][0], x + directions[i][1]);
//        }
//        }