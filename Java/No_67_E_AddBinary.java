public class No_67_E_AddBinary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {

        a = addZero(a, b.length() - a.length());
        b = addZero(b, a.length() - b.length());

        StringBuffer res = new StringBuffer();
        int overflow = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            int sum = a.charAt(i) - 48 + b.charAt(i) - 48 + overflow;
            if (sum == 3) {
                overflow = 1;
                res.append(1);
            } else if (sum == 2) {
                overflow = 1;
                res.append(0);
            } else if (sum == 1) {
                overflow = 0;
                res.append(1);
            } else {
                overflow = 0;
                res.append(0);
            }
            if (i == 0 && overflow == 1) {
                res.append(1);
            }
        }

        return res.reverse().toString();
    }

    private static String addZero(String s, int zeroNum) {
        String res = s;
        for (int i = 0; i < zeroNum; i++) {
            res = 0 + res;
        }
        return res;
    }
}
