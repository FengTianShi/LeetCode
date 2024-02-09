public class No_1415_M_TheKthLexicographicalStringOfAllHappyStringsOfLengthN {
    public static void main(String[] args) {
        System.out.println(new No_1415_M_TheKthLexicographicalStringOfAllHappyStringsOfLengthN().getHappyString(3, 9));
    }

    public String getHappyString(int n, int k) {
        StringBuffer sb = new StringBuffer();

        int count = 0;

        while (true) {
            if (sb.length() == 0) {
                for (int i = 0; i < n; i++) {
                    sb.append("a");
                }
            } else {
                sb = getNextString(sb);
            }

            if (isHappyString(sb)) {
                count++;
            }

            if (count == k) {
                return sb.toString();
            } else if (count >= Math.pow(2, n - 1) * 3) {
                return "";
            }
        }

    }

    public static boolean isHappyString(StringBuffer sb) {
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static StringBuffer getNextString(StringBuffer curr) {
        boolean carry = true;
        for (int i = curr.length() - 1; i >= 0; i--) {
            if (carry) {
                curr.replace(i, i + 1, String.valueOf(getNextChar(curr.charAt(i))));
                carry = false;
                if (curr.charAt(i) == 'a') {
                    carry = true;
                }
            }
        }
        return curr;
    }

    public static char getNextChar(char c) {
        if (c >= 'c') {
            return 'a';
        } else {
            return (char) (c + 1);
        }
    }

}
