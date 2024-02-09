public class No_66_E_PlusOne {
    public static void main(String[] args) {
        int[] digits = { 4, 3, 2, 1 };
        int[] res = plusOne(digits);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            int n = digits[i] + 1;
            if (n == 10) {
                digits[i] = 0;
                if (i == 0) {
                    int[] t = new int[digits.length + 1];
                    t[0] = 1;
                    for (int j = 0; j < digits.length; j++) {
                        t[j + 1] = digits[j];
                    }
                    digits = t;
                }
            } else {
                digits[i] = n;
                break;
            }
        }

        return digits;
    }
}
