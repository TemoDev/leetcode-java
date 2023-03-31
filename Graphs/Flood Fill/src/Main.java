import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    /*
    * An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].

To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.

Return the modified image after performing the flood fill.

    * */




    public static void main(String[] args) {
//        int[][] arr = floodFill(new int[][]{{1,1,1},{1,1,0},{1,0,1}}, 2, 2, 2);
//        int[][] arr = floodFill(new int[][]{{0,0,0},{0,0,0}}, 0, 0, 0);
        int[][] arr = floodFill(new int[][]{{0,0,0},{0,0,0}}, 1, 0, 2);

        for (int[] a: arr) {
            System.out.println(Arrays.toString(a));
        }
        for (boolean[] a: covered) {
            System.out.println(Arrays.toString(a));
        }
    }
//        Firs argument is y and second is x
//        UP, DOWN, RIGHT, LEFT

    static int[][] directions = {{-1,0}, {1,0}, {0,1}, {0, -1}};
    static boolean[][] covered;
    static boolean defineArr = true;
    static int target = 0;

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if(defineArr) {
            covered = new boolean[image.length][image[0].length];
            target = image[sr][sc];
            defineArr = false;
        }

        for (int i = 0; i < directions.length; i++) {
//           Base case
            if(sr + directions[i][0] < 0 || sr + directions[i][0] == image.length || sc + directions[i][1] < 0 || sc + directions[i][1] == image[0].length) {
                covered[sr][sc] = true;
                image[sr][sc] = color;
                continue;
            }
            if(image[sr + directions[i][0]][sc + directions[i][1]] == target && !covered[sr + directions[i][0]][sc + directions[i][1]]) {
                covered[sr][sc] = true;
                image[sr][sc] = color;
                floodFill(image, sr + directions[i][0], sc + directions[i][1], color);
            }
        }

        return image;
    }

}
