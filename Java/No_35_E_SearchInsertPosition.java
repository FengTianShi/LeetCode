public class No_35_E_SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5 };
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1])
            return nums.length;

        return bs(0, nums.length - 1, nums, target);
    }

    private static int bs(int i, int j, int[] nums, int target) {
        if (j - i <= 1)
            if (target > nums[i])
                return j;
            else
                return i;

        if (target > nums[(i + j) / 2])
            return bs((i + j) / 2, j, nums, target);
        else
            return bs(i, ((i + j) / 2), nums, target);
    }
}
