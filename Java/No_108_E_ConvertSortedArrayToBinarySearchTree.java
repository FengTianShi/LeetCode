package java_code;

import java_code.No_100_E_SameTree.TreeNode;

public class No_108_E_ConvertSortedArrayToBinarySearchTree {

    public static TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = traversal(nums, 0, nums.length - 1, null);
        return root;
    }

    public static TreeNode traversal(int[] nums, int start, int end, TreeNode n) {

        if (start == end - 1) {
            return new TreeNode(nums[start], null, new TreeNode(nums[end], null, null));
        }

        if (start == end) {
            return new TreeNode(nums[start]);
        }

        n = new TreeNode(nums[(start + end) / 2]);
        n.left = traversal(nums, start, (start + end) / 2 - 1, n.left);
        n.right = traversal(nums, (start + end) / 2 + 1, end, n.right);

        return n;
    }
}
