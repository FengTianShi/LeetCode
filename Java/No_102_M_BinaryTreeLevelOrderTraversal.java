import java.util.ArrayList;
import java.util.List;

public class No_102_M_BinaryTreeLevelOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0, null, null);
        TreeNode n1 = new TreeNode(1, null, null);
        TreeNode n2 = new TreeNode(2, null, null);
        TreeNode n3 = new TreeNode(3, null, null);

        root.right = n1;
        n1.left = n2;
        n2.right = n3;

        for (List<Integer> i : levelOrder(root)) {
            for (Integer j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static List<List<Integer>> resList = new ArrayList<>();

    public static List<List<Integer>> levelOrder(TreeNode root) {
        resList.clear();
        traversal(root, 0);
        return resList;
    }

    public static void traversal(TreeNode n, int level) {
        if (n == null) {
            return;
        }

        List<Integer> levelList;
        if (level > resList.size() - 1) {
            resList.add(new ArrayList<>());
        }
        levelList = resList.get(level);

        levelList.add(n.val);

        traversal(n.left, level + 1);
        traversal(n.right, level + 1);
    }
}
