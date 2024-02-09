class No_2_M_AddTwoNumbers {
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
        int over = 0;
        int x = 0;
        int y = 0;

        ListNode node = new ListNode(0);
        ListNode head = node;

        while (true) {
            x = 0;
            if (l1 != null) {
                x = l1.val;
                l1 = l1.next;
            }

            y = 0;
            if (l2 != null) {
                y = l2.val;
                l2 = l2.next;
            }

            if (x + y + over >= 10) {
                node.next = new ListNode((x + y + over) % 10);
                over = 1;
            } else {
                node.next = new ListNode(x + y + over);
                over = 0;
            }

            node = node.next;

            if (l1 == null && l2 == null)
                break;

        }

        if (over != 0) {
            node.next = new ListNode(1);
        }

        return head.next;
    }

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
}
