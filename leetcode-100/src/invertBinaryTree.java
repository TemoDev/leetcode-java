public class invertBinaryTree {
    public static void main(String[] args) {

    }
    public static TreeNode invertTree(TreeNode root) {
        if(root.left == null || root.right == null) return null;
        traverse(root.left);
        traverse(root.right);
        return root;
    }
    public static TreeNode temp = null;
    public static void traverse(TreeNode root) {
        if(root == null) return;
        temp = root.right;
        root.right = root.left;
        root.left = temp;
        traverse(root.left);
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
}
