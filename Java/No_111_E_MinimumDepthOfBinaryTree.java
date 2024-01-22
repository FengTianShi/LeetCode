package java_code;

public class No_111_E_MinimumDepthOfBinaryTree {
    private int minLevel = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        traversal(root, 1);
        return minLevel;
    }

    private void traversal(TreeNode n, int level) {
        if (n == null)
            return;

        if (n.left == null && n.right == null && level < minLevel) {
            minLevel = level;
            return;
        }

        traversal(n.left, level + 1);
        traversal(n.right, level + 1);
    }
}
