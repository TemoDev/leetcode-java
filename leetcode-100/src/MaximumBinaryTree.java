public class MaximumBinaryTree {
    public static void main(String[] args) {
        constructMaximumBinaryTree(new int[]{1,2,3});
    }
    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 0) return null;
        if(nums.length == 1) return new TreeNode(nums[0]);
        TreeNode root = new TreeNode();
//        Find max num in arr
        int[] max = findMax(nums, 0, nums.length);
        root.val = max[0];
//        Check left validity
        if(max[1] + 1 != nums.length) {
//            construct new arr
            int[] arr = new int[nums.length - (max[1] + 1)];
            int counter = 0;
            for (int i = max[1] + 1; i < nums.length; i++) {
                arr[counter] = nums[i];
                counter++;
            }
//            Recursion call to add tree on the right
            root.right = constructMaximumBinaryTree(arr);
        }
        if(max[1] - 1 >= 0) {
//            new array to check all the elements on the right
            int[] arr = new int[max[1]];
            int incrementer = 0;
            for (int i = 0; i < max[1]; i++) {
                arr[incrementer] = nums[i];
                incrementer++;
            }//            Recursion call to add tree on the right
            root.left = constructMaximumBinaryTree(arr);
        }
        return root;
    }
    public static int[] findMax(int[] nums, int start, int end) {
        int[] max = new int[]{nums[0], 0};
        for (int i = start; i < end; i++) {
            if(nums[i] > max[0]) max = new int[]{nums[i],i};
        }
        return max;
    }
}
