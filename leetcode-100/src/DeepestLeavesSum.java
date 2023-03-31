public class DeepestLeavesSum {
    public static void main(String[] args) {

    }
    public static int maxDepth = 0;
    public static int sum = 0;
    public static int deepestLeavesSum(TreeNode root) {
        goDeep(root, 0);
        return sum;
    }
    public static void goDeep(TreeNode root, int depth) {
        if(root == null) return;
        if(depth > maxDepth) {
            maxDepth = depth;
            sum = 0;
            sum += root.val;
        } else if(depth == maxDepth) {
            sum += root.val;
        }
        goDeep(root.left, depth + 1);
        goDeep(root.right, depth + 1);
    }
}
