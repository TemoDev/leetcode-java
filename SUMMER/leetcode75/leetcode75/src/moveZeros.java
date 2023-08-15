public class moveZeros {
    public static void main(String[] args) {


    }
    public void moveZeroes(int[] nums) {
        int zeroes = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeroes++;
            }
        }
        int startIndex = nums.length - 1;
        int secondIndex = nums.length - 1;
        int temp = 0;
        while(zeroes != 0) {
            for (int i = nums.length - 1; i >= 0; i--) {
                if(nums[i] == 0) {
                    zeroes--;
                    secondIndex = i;
                    while(secondIndex < startIndex) {
                        temp = nums[secondIndex + 1];
                        nums[secondIndex] = temp;
                        nums[secondIndex + 1] = 0;
                        secondIndex++;
                    }
                    startIndex--;
                }
            }
        }
    }
}
