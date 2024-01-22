package java_code;

import java.util.ArrayList;
import java.util.List;

public class No_113_M_PathSumII {

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

    public static List<List<Integer>> resList;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        resList = new ArrayList<>();
        traversal(root, 0, new ArrayList<>(), targetSum);
        return resList;
    }

    public void traversal(TreeNode n, int pathSum, List<Integer> pathVal, int targetSum) {
        if (n == null)
            return;

        pathSum += n.val;
        pathVal.add(n.val);

        if (n.left == null && n.right == null && pathSum == targetSum) {
            resList.add(new ArrayList<>(pathVal));
        }

        traversal(n.left, pathSum, pathVal, targetSum);
        traversal(n.right, pathSum, pathVal, targetSum);

        pathVal.remove(pathVal.size() - 1);
    }
}
