package java_code;

public class No_70_E_ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(35));
    }

    public static int climbStairs(int n) {
        int r = 0;
        for (int i = n; i >= 0; i = i - 2) {
            r += (int) (factorial(i + ((n - i) / 2))) / (factorial(i) * factorial((n - i) / 2));
        }

        return r;
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
