package java_code;

public class No_283_E_MoveZeroes {
    public static void main(String[] args) {

    }

    // public void moveZeroes(int[] nums) {
    // int tail = nums.length - 1;
    // for (int i = 0; i <= tail; i++) {
    // if (nums[i] == 0) {
    // for (int j = i; j < tail; j++) {
    // nums[j] = nums[j + 1];
    // }
    // nums[tail] = 0;
    // tail--;
    // i--;
    // }
    // }
    // }

    // Athor good way to do
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
