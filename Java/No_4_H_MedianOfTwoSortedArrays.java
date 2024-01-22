package java_code;

public class No_4_H_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        No_4_H_MedianOfTwoSortedArrays medianOfTwoSortedArrays = new No_4_H_MedianOfTwoSortedArrays();
        System.out.println(
                medianOfTwoSortedArrays.findMedianSortedArrays(new int[] {}, new int[] { 2, 3 }));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        int p = 0, q = 0;
        for (int i = 0; i < nums1.length + nums2.length; i++) {
            if (p == nums1.length) {
                nums3[i] = nums2[q];
                q++;
            } else if (q == nums2.length) {
                nums3[i] = nums1[p];
                p++;
            } else {
                if (nums1[p] <= nums2[q]) {
                    nums3[i] = nums1[p];
                    p++;
                } else {
                    nums3[i] = nums2[q];
                    q++;
                }
            }
        }

        // for (int i : nums3) {
        // System.out.println(i);
        // }

        if (nums3.length % 2 == 0) {
            return (nums3[nums3.length / 2 - 1] + nums3[nums3.length / 2]) / 2.0;
        } else {
            return nums3[nums3.length / 2];
        }
    }

}