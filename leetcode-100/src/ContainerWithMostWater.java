public class ContainerWithMostWater {
    public static void main(String[] args) {
        maxArea(new int[]{1,8,6,2,5,4,8,3,7});
    }
    public static int maxArea(int[] height) {
        int f = 0;
        int s = height.length - 1;
        int area = 0;
        while(f != s) {
            int newArea;
            if(height[f] < height[s]) {
                newArea = height[f] * (s - f);
            } else {
                newArea = height[s] * (s - f);
            }
            if(newArea > area) area = newArea;
            if(height[f] < height[s]){
                f++;
            } else{
                s--;
            }
        }
        return area;
    }
}