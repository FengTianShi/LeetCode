public class No_12_M_IntegerToRoman {
    public static void main(String[] args) {
        No_12_M_IntegerToRoman integerToRoman = new No_12_M_IntegerToRoman();
        System.out.println(integerToRoman.intToRoman(1994));
    }

    public String intToRoman(int num) {
        String roman = "";
        for (int i = 1000; num > 0; num = num % i, i /= 10) {
            roman += getChar(num / i, i);
        }
        return roman;
    }

    // Symbol Value
    // I 1
    // V 5
    // X 10
    // L 50
    // C 100
    // D 500
    // M 1000
    public String getChar(int num, int c) {
        String s = "";
        for (int i = 1; i <= num; i++) {
            if (i == 4) {
                switch (c) {
                    case 1:
                        s = "IV";
                        break;
                    case 10:
                        s = "XL";
                        break;
                    case 100:
                        s = "CD";
                        break;
                    case 1000:
                        s += "M";
                        break;
                }
            } else if (i == 5) {
                switch (c) {
                    case 1:
                        s = "V";
                        break;
                    case 10:
                        s = "L";
                        break;
                    case 100:
                        s = "D";
                        break;
                    case 1000:
                        s += "M";
                        break;
                }
            } else if (i == 9) {
                switch (c) {
                    case 1:
                        s = "IX";
                        break;
                    case 10:
                        s = "XC";
                        break;
                    case 100:
                        s = "CM";
                        break;
                    case 1000:
                        s += "M";
                        break;
                }
            } else {
                switch (c) {
                    case 1:
                        s += "I";
                        break;
                    case 10:
                        s += "X";
                        break;
                    case 100:
                        s += "C";
                        break;
                    case 1000:
                        s += "M";
                        break;
                }
            }
        }
        return s;
    }
}