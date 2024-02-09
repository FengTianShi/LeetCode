public class No_110_E_BalancedBinaryTree {

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

    public static void main(String[] args) {
        TreeNode n0 = new TreeNode(1, null, null);
        TreeNode n1 = new TreeNode(2, null, null);
        TreeNode n2 = new TreeNode(3, null, null);
        TreeNode n3 = new TreeNode(4, null, null);
        TreeNode n4 = new TreeNode(5, null, null);
        TreeNode n5 = new TreeNode(6, null, null);
        TreeNode n6 = new TreeNode(8, null, null);

        n0.left = n1;
        n0.right = n2;

        n1.left = n3;
        n1.right = n4;

        n2.left = n5;

        n3.left = n6;

        System.out.println(isBalanced(n0));
    }

    private static boolean isBalanced;

    public static boolean isBalanced(TreeNode root) {
        isBalanced = true;
        traversal(root, 0);
        return isBalanced;
    }

    private static int traversal(TreeNode n, int level) {
        if (n == null) {
            return level;
        }

        int ll = traversal(n.left, level + 1);
        int rl = traversal(n.right, level + 1);

        if (isBalanced && Math.abs(ll - rl) > 1) {
            isBalanced = false;
        }

        return ll > rl ? ll : rl;
    }

}
