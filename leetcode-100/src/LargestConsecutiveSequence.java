import java.util.*;

public class LargestConsecutiveSequence {
    public static void main(String[] args) {
//        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
        System.out.println(longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> list = new HashSet<>();
        int maxLength = 0;
        int length;
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if(!list.contains(nums[i] - 1)) {
                length = 0;
                while(list.contains(length + nums[i])) {
                    length++;
                }
                if(length > maxLength) maxLength = length;
            }
        }
        return maxLength;
    }
}
