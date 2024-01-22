package java_code;

public class No_9_E_PalindromeNumber {
    public static void main(String[] args) {
        int x = -1;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int tmp = x;
        int r = 0;
        while (tmp != 0) {
            int i = tmp % 10;
            r = r * 10 + i;
            tmp = tmp / 10;
        }
        return r == x ? true : false;
    }

    public static boolean isPalindrome1(int x) {
        if (x < 0)
            return false;

        String str = x + "";

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j))
                return false;
        }

        return true;
    }

}