package java_code;

public class No_203_E_RemoveLinkedListElements {

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

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        ListNode n = head;
        ListNode p = new ListNode(0, head);
        ListNode h = p;

        while (true) {
            if (n == null) {
                break;
            }

            if (n.val == val) {
                // Remove this node
                p.next = n.next;
            } else {
                p = p.next;
            }

            n = p.next;
        }

        return h.next;
    }

}
