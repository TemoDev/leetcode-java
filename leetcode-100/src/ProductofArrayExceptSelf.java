import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{2,3,5,0})));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int prefix = 1;
        int postfix = 1;
        for (int i = 0; i < nums.length; i++) {
            if(res[i] == 0) res[i] = 1;
            res[i] *= prefix;
            prefix *= nums[i];
        }
        for (int i = nums.length - 1; i > -1; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }
        return res;
    }
}
