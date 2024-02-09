import java.util.ArrayList;
import java.util.List;

class TreeNode {
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

public class No_94_E_BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        No_94_E_BinaryTreeInorderTraversal binaryTreeInorderTraversal = new No_94_E_BinaryTreeInorderTraversal();
        TreeNode node3 = new TreeNode(5, null, null);
        TreeNode node4 = new TreeNode(6, null, null);
        TreeNode node5 = new TreeNode(7, null, null);
        TreeNode node1 = new TreeNode(3, node3, node4);
        TreeNode node2 = new TreeNode(4, null, node5);
        TreeNode root = new TreeNode(2, node1, node2);
        System.out.println(binaryTreeInorderTraversal.inorderTraversal(root).toString());
    }

    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {
        doInorderTraversal(root);
        return arrayList;
    }

    public void doInorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        doInorderTraversal(node.left);
        arrayList.add(node.val);
        doInorderTraversal(node.right);
    }
}
