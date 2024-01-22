package java_code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class No_150_M_EvaluateReversePolishNotation {
    public static void main(String[] args) {
        // String[] tokens = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        // String[] tokens1 = { "4", "-2", "/", "2", "-3", "-", "-" };
        // String[] tokens2 = { "3", "11", "5", "+", "-" }; // -13
        String[] tokens3 = { "3", "11", "+", "5", "-" }; // 9
        System.out.println(evalRPN(tokens3));
    }

    // 优化 检索用hash
    public static int evalRPN(String[] tokens) {
        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }

        Stack<Integer> stack = new Stack<>();
        Set<String> operator = new HashSet<>(Arrays.asList("+", "-", "/", "*"));

        for (int i = 0; i < tokens.length; i++) {
            if (!operator.contains(tokens[i])) {
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (tokens[i]) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            }

        }

        return stack.pop();
    }
}
