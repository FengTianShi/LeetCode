import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No_17_M_LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        List<String> s = letterCombinations(digits);
        for (String i : s) {
            System.out.println(i);
        }
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return new ArrayList<String>();
        List<List<String>> letters = new ArrayList<>();
        letters.add(Arrays.asList("a", "b", "c"));
        letters.add(Arrays.asList("d", "e", "f"));
        letters.add(Arrays.asList("g", "h", "i"));
        letters.add(Arrays.asList("j", "k", "l"));
        letters.add(Arrays.asList("m", "n", "o"));
        letters.add(Arrays.asList("p", "q", "r", "s"));
        letters.add(Arrays.asList("t", "u", "v"));
        letters.add(Arrays.asList("w", "x", "y", "z"));

        List<String> res = getLetter(letters, digits.charAt(0));
        for (int i = 1; i < digits.length(); i++) {
            res = getCartesianProduct(res, getLetter(letters, digits.charAt(i)));
        }
        return res;
    }

    public static List<String> getLetter(List<List<String>> letters, char c) {
        int i = c - 50;
        return letters.get(i);
    }

    public static List<String> getCartesianProduct(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>();
        for (String item1 : list1) {
            for (String item2 : list2) {
                result.add(item1 + item2);
            }
        }
        return result;
    }
}
