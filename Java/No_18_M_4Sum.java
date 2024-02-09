import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No_18_M_4Sum {
    public static void main(String[] args) {
        int[] nums = { 1000000000, 1000000000, 1000000000, 1000000000 };
        int target = -294967296;
        List<List<Integer>> res = fourSum(nums, target);
        for (List<Integer> l : res) {
            for (Integer i : l) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1])
                    continue;
                int p = j + 1, q = nums.length - 1;
                while (p < q) {
                    long sum = ((long) nums[i] + (long) nums[j] + (long) nums[p] + (long) nums[q]);
                    if (sum < target) {
                        p++;
                    } else if (sum > target) {
                        q--;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        p++;
                        q--;
                        while (p < q && nums[p] == nums[p - 1])
                            p++;
                        while (p < q && nums[q] == nums[q + 1])
                            q--;
                    }
                }
            }
        }

        return res;
    }
}
