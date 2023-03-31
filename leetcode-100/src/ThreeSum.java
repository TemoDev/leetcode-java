import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{0,0,0}));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1;
            int r = nums.length - 1;
            while(l < r) {
                int threeSum = nums[i] + nums[l] + nums[r];
                if(threeSum > 0)
                    r -= 1;
                else if (threeSum < 0) {
                    l += 1;
                } else {
                    arr.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l += 1;
                    while(nums[l] == nums[l-1] && l < r) l+= 1;

                }
            }
        }

        return arr;
    }
}
