package java_code;

public class No_28_E_FindTheIndexOfTheFirstOccurrenceinAString {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (i + needle.length() <= haystack.length()) {
                    if (haystack.substring(i, i + needle.length()).equals(needle)) {
                        return i;
                    }
                } else {
                    return -1;
                }
            }
        }
        return -1;
    }
}
