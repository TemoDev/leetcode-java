import java.util.ArrayList;

public class CountGoodNodesinBinaryTree {
    public static void main(String[] args) {

    }
    public int goodNodes(TreeNode root) {
        return aux(root, Integer.MIN_VALUE);
    }
    public int aux(TreeNode root, int contains) {
        if(root==null) return 0;
        int res = root.val>=contains ? 1 : 0;

        res += aux(root.left, Math.max(root.val, contains));
        res += aux(root.right, Math.max(root.val, contains));

        return res;
    }
}
