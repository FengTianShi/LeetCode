package java_code;

import java.util.ArrayList;
import java.util.List;

import java_code.No_100_E_SameTree.TreeNode;

public class No_103_M_BinaryTreeZigzagLevelOrderTraversal {
    public static List<List<Integer>> resList = new ArrayList<>();

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        resList.clear();
        traversal(root, 0, true);
        return resList;
    }

    public static void traversal(TreeNode n, int level, boolean order) {
        if (n == null) {
            return;
        }

        List<Integer> levelList;
        if (level > resList.size() - 1) {
            resList.add(new ArrayList<>());
        }
        levelList = resList.get(level);

        if (order) {
            levelList.add(n.val);
        } else {
            levelList.add(0, n.val);
        }

        traversal(n.left, level + 1, !order);
        traversal(n.right, level + 1, !order);
    }
}
