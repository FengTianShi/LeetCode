package java_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No_22_M_GenerateParentheses {

    public static void main(String[] args) {
        No_22_M_GenerateParentheses test = new No_22_M_GenerateParentheses();

        List<String> res = test.generateParenthesis(9);
        for (String s : res) {
            System.out.println(s);
        }
    }

    public void print(TreeNode t) {
        if (t == null) {
            return;
        }
        System.out.println(t.val);
        print(t.left);
        print(t.right);
    }

    List<String> res = new ArrayList<String>();

    public List<String> generateParenthesis(int n) {
        searchLegal(generate(null, 0, 0, n));
        return res;
    }

    private TreeNode generate(TreeNode t, int val, int level, int n) {
        if (level == 2 * n) {
            return null;
        }
        return t = new TreeNode(val,
                generate(null, 0, level + 1, n),
                generate(null, 1, level + 1, n));
    }

    List<Integer> list = new ArrayList<Integer>();

    private void searchLegal(TreeNode t) {
        if (t.left == null && t.right == null) {
            list.add(t.val);
            if (isLegal()) {
                addToRes();
            }
            list.remove(list.size() - 1);
            return;
        }
        list.add(t.val);
        searchLegal(t.left);
        searchLegal(t.right);
        list.remove(list.size() - 1);
    }

    private boolean isLegal() {
        Stack<Integer> s = new Stack<Integer>();
        // StringBuffer ss = new StringBuffer();
        for (int i : list) {
            // ss.append(i);
            if (i == 0 || s.empty() || s.peek() == i) {
                s.push(i);
            } else {
                s.pop();
            }
        }
        // System.out.println("checking:" + ss.toString() + " res:" + s.empty());
        return s.empty();
    }

    private void addToRes() {
        StringBuffer s = new StringBuffer();
        for (int i : list) {
            if (i == 0) {
                s.append("(");
            } else {
                s.append(")");
            }
        }
        res.add(s.toString());
    }
}
