import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        List<Integer> ls = new ArrayList<>();
        while(left <= right && top <= bottom) {
            for (int i = left; i < right + 1; i++) {
                ls.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i < bottom + 1; i++) {
                ls.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom) {
                for (int i = right; i > left - 1; i--) {
                    ls.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right) {
                for (int i = bottom; i > top - 1; i--) {
                    ls.add(matrix[i][left]);
                }
                left++;
            }

        }
        return ls;
    }
}
