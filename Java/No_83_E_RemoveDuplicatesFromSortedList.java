package java_code;

public class No_83_E_RemoveDuplicatesFromSortedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode p = new ListNode(0, null);
        ListNode n1 = new ListNode(1, null);
        ListNode n2 = new ListNode(2, null);
        ListNode n3 = new ListNode(3, null);
        ListNode n4 = new ListNode(4, null);

        p.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        while (true) {
            if (p == null)
                break;
            System.out.println(p.val);
            p = p.next;
        }

    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;

        ListNode p = head;
        ListNode q = head;

        while (p != null) {
            if (q.val != p.val) {
                q.next = p;
                q = p;
            }
            p = p.next;
        }
        q.next = null;

        return head;
    }
}
