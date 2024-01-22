package java_code;

import java.util.ArrayList;

public class No_109_M_ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null)
            return null;

        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int[] intArray = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return sortedArrayToBST(intArray);
    }

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
