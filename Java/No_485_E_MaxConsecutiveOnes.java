public class No_485_E_MaxConsecutiveOnes {
    public static void main(String[] args) {

    }

    public int findMaxConsecutiveOnes(int[] nums) {

        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            }

            if (nums[i] == 0 || i == nums.length - 1) {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 0;
            }
        }

        return maxCount;
    }
}
