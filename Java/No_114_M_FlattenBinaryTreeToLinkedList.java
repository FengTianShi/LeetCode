package java_code;

public class No_114_M_FlattenBinaryTreeToLinkedList {
    private TreeNode p;

    public void flatten(TreeNode root) {
        traversal(root);
        format(root);
    }

    public void traversal(TreeNode n) {
        if (n == null)
            return;

        if (p != null) {
            p.left = n;
            p = p.left;
        }

        traversal(n.left);

        if (p == null) {
            p = n;
        }

        traversal(n.right);
    }

    public void format(TreeNode n) {
        if (n == null)
            return;

        n.right = n.left;
        n.left = null;

        format(n.right);
    }
}
