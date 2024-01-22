package java_code;

public class No_112_E_PathSum {
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

    public static boolean res;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        res = false;
        traversal(root, 0, targetSum);
        return res;
    }

    public void traversal(TreeNode n, int pathSum, int targetSum) {
        if (n == null)
            return;

        pathSum += n.val;

        if (n.left == null && n.right == null && pathSum == targetSum) {
            res = true;
        }

        traversal(n.left, pathSum, targetSum);
        traversal(n.right, pathSum, targetSum);
    }
}
