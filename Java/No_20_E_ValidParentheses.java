package java_code;

import java.util.Stack;

public class No_20_E_ValidParentheses {
    public static void main(String[] args) {
        String s = "(())";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.empty())
                    return false;

                char c = stack.pop();
                if (!((c == '(' && s.charAt(i) == ')')
                        || (c == '[' && s.charAt(i) == ']')
                        || (c == '{' && s.charAt(i) == '}'))) {
                    return false;
                }
            }
        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }

    }

}
