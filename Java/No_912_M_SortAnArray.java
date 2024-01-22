package java_code;

public class No_912_M_SortAnArray {

    public static void main(String[] args) {
        int[] nums = { 100, 109, 1, 6, 7 };
        nums = sortArray(nums);

        for (int i : nums) {
            System.out.println(i);
        }
    }

    public static int[] sortArray(int[] nums) {
        partition(nums, 0, nums.length - 1);
        return nums;
    }

    private static void partition(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }

        partition(nums, l, (l + r) / 2);
        partition(nums, (l + r) / 2 + 1, r);
        marge(nums, l, r);
    }

    private static void marge(int[] nums, int l, int r) {
        int p = l;
        int q = (l + r) / 2 + 1;
        int[] tmp = new int[r - l + 1];
        int k = 0;
        while (p <= (l + r) / 2 && q <= r) {
            if (nums[p] < nums[q]) {
                tmp[k] = nums[p];
                p++;
            } else {
                tmp[k] = nums[q];
                q++;
            }
            k++;
        }
        while (p <= (l + r) / 2) {
            tmp[k] = nums[p];
            p++;
            k++;
        }
        while (q <= r) {
            tmp[k] = nums[q];
            q++;
            k++;
        }
        for (int i = l, j = 0; j < tmp.length; i++, j++) {
            nums[i] = tmp[j];
        }
    }
}
