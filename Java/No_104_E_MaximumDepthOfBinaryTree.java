public class No_104_E_MaximumDepthOfBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static int maxDepth(TreeNode root) {
        return traversal(root, 0);
    }

    private static int traversal(TreeNode n, int level) {
        if (n == null)
            return level;

        int ll = traversal(n.left, level + 1);
        int rl = traversal(n.right, level + 1);

        return ll > rl ? ll : rl;
    }

}
