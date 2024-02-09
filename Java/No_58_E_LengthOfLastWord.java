public class No_58_E_LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == ' ') {
                return s.length() - i - 1;
            }
        }
        return s.length();
    }
}
