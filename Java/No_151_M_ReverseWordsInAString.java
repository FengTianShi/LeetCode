package java_code;

public class No_151_M_ReverseWordsInAString {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                for (int j = i; j <= s.length() - 1; j++) {
                    if (s.charAt(j) == ' ')
                        break;

                    sb.append(s.charAt(j));
                }
                sb.append(' ');
            }
        }

        return sb.toString().substring(0, sb.length() - 1);
    }

}
