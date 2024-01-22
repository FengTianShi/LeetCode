package java_code;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class No_1_E_TwoSum {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 4 };
        int target = 6;

        for (int i : twoSum(nums, target)) {
            System.out.println(i);

        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if (map.containsKey(tmp)) {
                int j = map.get(tmp);
                if (i != j)
                    return new int[] { i, map.get(tmp) };
            }
        }

        return null;
    }

    public static int[] twoSum2(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }

        List<Map.Entry<Integer, Integer>> list = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());

        int i = 0;
        int j = list.size() - 1;

        while (true) {
            if (list.get(i).getValue() + list.get(j).getValue() == target) {
                return new int[] { list.get(i).getKey(), list.get(j).getKey() };
            } else if (list.get(i).getValue() + list.get(j).getValue() < target) {
                i++;
            } else if (list.get(i).getValue() + list.get(j).getValue() > target) {
                j--;
            }
        }

    }
}
