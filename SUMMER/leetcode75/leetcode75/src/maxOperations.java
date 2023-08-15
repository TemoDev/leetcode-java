import java.util.Arrays;

public class maxOperations {
    public static void main(String[] args) {

    }
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0; int r = nums.length - 1;
        int res = 0;

        while(l < r){
            if(nums[l] + nums[r] == k){
                l += 1; r -= 1;
                res += 1;
            }
            else if(nums[l] + nums[r] < k) l += 1;
            else r-= 1;
        }

        return res;
    }
}
