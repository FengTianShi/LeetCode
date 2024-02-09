public class No_100_E_SameTree {

    static class TreeNode {
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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            if (p != q) {
                return false;
            } else {
                return true;
            }
        }

        if (p.val != q.val) {
            return false;
        }
        if (isSameTree(p.left, q.left)) {
            return isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }
}
