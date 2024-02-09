public class No_101_E_SymmetricTree {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        return isSymmetricTwo(root, root);
    }

    public static boolean isSymmetricTwo(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            if (p != q)
                return false;
            else
                return true;
        }

        if (p.val != q.val) {
            return false;
        }
        if (isSymmetricTwo(p.left, q.right)) {
            return isSymmetricTwo(p.right, q.left);
        } else {
            return false;
        }
    }
}
