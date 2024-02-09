public class No_206_E_ReverseLinkedList {

    public class ListNode {
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

    }

    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;

        ListNode p = null;
        ListNode q = head;
        ListNode r = head.next;

        while (true) {
            q.next = p;
            p = q;
            q = r;
            if (r == null)
                break;
            r = r.next;
        }

        return p;
    }

}
