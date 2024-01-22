package java_code;

import java.util.ArrayList;

public class No_933_E_NumberOfRecentCalls {

    public static void main(String[] args) {
        No_933_E_NumberOfRecentCalls c = new No_933_E_NumberOfRecentCalls();

        System.out.println(c.ping(1178));
        System.out.println(c.ping(1483));
        System.out.println(c.ping(1563));
        System.out.println(c.ping(4054));
        System.out.println(c.ping(4152));
    }

    ArrayList<Integer> req = new ArrayList<Integer>();

    public No_933_E_NumberOfRecentCalls() {
        req.add(-3000);
    }

    public int ping(int t) {
        req.add(t);

        int index = searchRecentSmallerIndex(0, req.size() - 1, t - 3000);
        return req.size() - 1 - index;
    }

    public int searchRecentSmallerIndex(int star, int end, int val) {

        if (end - star == 0 || end - star == 1) {
            if (val <= req.get(star)) {
                return star - 1;
            } else if (val == req.get(end)) {
                return end - 1;
            } else if (val > req.get(end)) {
                return end;
            } else {
                return star;
            }
        }

        int mid = (star + end) / 2;

        if (req.get(mid) > val) {
            return searchRecentSmallerIndex(star, mid, val);
        } else {
            return searchRecentSmallerIndex(mid, end, val);
        }

    }
}