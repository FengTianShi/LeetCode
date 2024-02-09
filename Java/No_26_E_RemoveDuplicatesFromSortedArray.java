import java.util.LinkedHashSet;

public class No_26_E_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int l = removeDuplicates(nums);
        for (int i = 0; i < l; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 1)
            return 1;
        int i = 0, j = 1;
        int tmp = nums[0];
        while (i < nums.length && j < nums.length) {
            if (nums[i] != tmp) {
                tmp = nums[i];
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
    }

    public int removeDuplicates1(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (Integer i : nums) {
            set.add(i);
        }
        int i = 0;
        for (Integer num : set) {
            nums[i] = num;
            i++;
        }
        return i;
    }

}
