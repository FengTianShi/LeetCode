package java_code;

import java.util.Arrays;

class No_16_M_3SumClosest {
    public static void main(String[] args) {
        int[] nums = { 13, 252, -87, -431, -148, 387, -290, 572, -311, -721, 222, 673, 538, 919, 483, -128, -518, 7,
                -36, -840, 233, -184, -541, 522, -162, 127, -935, -397, 761, 903, -217, 543, 906, -503, -826, -342, 599,
                -726, 960, -235, 436, -91, -511, -793, -658, -143, -524, -609, -728, -734, 273, -19, -10, 630, -294,
                -453, 149, -581, -405, 984, 154, -968, 623, -631, 384, -825, 308, 779, -7, 617, 221, 394, 151, -282,
                472, 332, -5, -509, 611, -116, 113, 672, -497, -182, 307, -592, 925, 766, -62, 237, -8, 789, 318, -314,
                -792, -632, -781, 375, 939, -304, -149, 544, -742, 663, 484, 802, 616, 501, -269, -458, -763, -950,
                -390, -816, 683, -219, 381, 478, -129, 602, -931, 128, 502, 508, -565, -243, -695, -943, -987, -692,
                346, -13, -225, -740, -441, -112, 658, 855, -531, 542, 839, 795, -664, 404, -844, -164, -709, 167, 953,
                -941, -848, 211, -75, 792, -208, 569, -647, -714, -76, -603, -852, -665, -897, -627, 123, -177, -35,
                -519, -241, -711, -74, 420, -2, -101, 715, 708, 256, -307, 466, -602, -636, 990, 857, 70, 590, -4, 610,
                -151, 196, -981, 385, -689, -617, 827, 360, -959, -289, 620, 933, -522, 597, -667, -882, 524, 181, -854,
                275, -600, 453, -942, 134 };
        int target = -1237;
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int minRange = Math.abs(target - (nums[0] + nums[1] + nums[2]));
        int minVal = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int p = i + 1, q = nums.length - 1;
            while (p < q) {
                int range = Math.abs(target - (nums[i] + nums[p] + nums[q]));
                int val = nums[i] + nums[p] + nums[q];

                if (range < minRange) {
                    minRange = range;
                    minVal = val;
                }

                if (val < target) {
                    p++;
                } else if (val > target) {
                    q--;
                } else {
                    return val;
                }

            }

        }

        return minVal;
    }

}