import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class No_15_M_3Sum {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> res = threeSum(nums);

        for (List<Integer> i : res) {
            for (Integer j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        Set<List<Integer>> set = new HashSet<>();
        set.add(Arrays.asList(0, 0, 0));
        set.add(Arrays.asList(0, 0, 0));
        set.add(Arrays.asList(1, 0, 0));
        System.out.println(set);
    }

    // 优化 找相反数的方法 去重方法
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            int p = i + 1, q = nums.length - 1;
            while (p < q) {
                if (nums[i] + nums[p] + nums[q] < 0) {
                    p++;
                } else if (nums[i] + nums[p] + nums[q] > 0) {
                    q--;
                } else {
                    res.add(Arrays.asList(nums[p], nums[i], nums[q]));
                    p++;
                    q--;
                    while (p < q && nums[p] == nums[p - 1])
                        p++;
                    while (p < q && nums[q] == nums[q + 1])
                        q--;
                }
            }

        }

        return res;
    }

}