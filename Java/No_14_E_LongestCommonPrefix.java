package java_code;

class No_14_E_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = { "ab", "a" };
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        for (int i = 1; i < strs.length; i++) {
            s = findLongestCommonPrefixByTwo(s, strs[i]);
        }
        return s;
    }

    private static String findLongestCommonPrefixByTwo(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0)
            return "";

        int size;
        if (s1.length() > s2.length()) {
            size = s2.length();
        } else {
            size = s1.length();
        }

        String s = "";
        for (int i = 0; i < size; i++) {
            if (s1.substring(0, size - i).equals(s2.substring(0, size - i))) {
                s = s1.substring(0, size - i);
                break;
            }
        }
        return s;
    }

    public String longestCommonPrefix1(String[] strs) {

        int size = 201;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < size) {
                size = strs[i].length();
            }
        }

        String res = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != strs[0].charAt(i)) {
                    return res;
                }
            }
            res = res + strs[0].charAt(i);
        }

        return res;
    }

    public String longestCommonPrefix3(String[] strs) {

        String res = "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].length() < i + 1 || strs[j].charAt(i) != c) {
                    return res;
                }
            }
            res = res + c;
        }

        return res;
    }

}