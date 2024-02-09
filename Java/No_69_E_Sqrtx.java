public class No_69_E_Sqrtx {
    public static void main(String[] args) {
        int x = 9;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        if (x == 0)
            return 0;
        if (x == 1)
            return 1;

        return bs(0, x, x);
    }

    private static int bs(int i, int j, int target) {
        if (j - i == 1)
            return i;

        if ((long) ((i + j) / 2) * (long) ((i + j) / 2) > target)
            return bs(i, ((i + j) / 2), target);
        else
            return bs((i + j) / 2, j, target);
    }
}
