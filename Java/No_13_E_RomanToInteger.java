package java_code;

public class No_13_E_RomanToInteger {
    public static void main(String[] args) {
        No_13_E_RomanToInteger romanToInteger = new No_13_E_RomanToInteger();
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (i == s.length() - 1 || getNum(s.charAt(i)) >= getNum(s.charAt(i + 1))) {
                sum += getNum(s.charAt(i));
            } else {
                sum -= getNum(s.charAt(i));
            }
        }
        return sum;
    }

    // Symbol Value
    // I 1
    // V 5
    // X 10
    // L 50
    // C 100
    // D 500
    // M 1000
    public int getNum(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}