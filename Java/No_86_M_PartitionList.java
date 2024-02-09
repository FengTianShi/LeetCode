public class No_86_M_PartitionList {
    public ListNode partition(ListNode head, int x) {

        ListNode h = new ListNode();
        h.next = head;
        ListNode i = h;
        ListNode j = h.next;

        ListNode res = new ListNode();
        ListNode p = res;

        while (j != null) {
            if (j.val < x) {
                p.next = new ListNode(j.val);
                p = p.next;
                i.next = j.next;
            } else {
                i = i.next;
            }
            j = j.next;
        }

        p.next = h.next;
        return res.next;
    }
}
