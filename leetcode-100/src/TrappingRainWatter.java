import java.util.ArrayList;
import java.util.List;

public class TrappingRainWatter {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{1}));
    }
    public static int trap(int[] height) {
        if(height.length == 0) return 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int leftMax = height[leftPointer];
        int rightMax = height[rightPointer];
        int sum = 0;
        while(leftPointer < rightPointer) {
            if(leftMax <= rightMax) {
                leftPointer++;
                leftMax = Math.max(leftMax, height[leftPointer]);
                sum += leftMax - height[leftPointer];
            } else {
                rightPointer--;
                rightMax = Math.max(rightMax, height[rightPointer]);
                sum += rightMax - height[rightPointer];
            }
        }
        return sum;
    }
}
