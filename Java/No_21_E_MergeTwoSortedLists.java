package java_code;

public class No_21_E_MergeTwoSortedLists {

    static public class ListNode {
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
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        node4.next = node5;
        node5.next = node6;

        ListNode node = new No_21_E_MergeTwoSortedLists().mergeTwoLists(node1, node4);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            ListNode p = new ListNode();
            ListNode h = p;
            ListNode p1 = list1;
            ListNode p2 = list2;
            while (true) {
                if (p1 == null) {
                    p.next = p2;
                    break;
                }
                if (p2 == null) {
                    p.next = p1;
                    break;
                }
                if (p1.val <= p2.val) {
                    p.next = p1;
                    p1 = p1.next;
                } else {
                    p.next = p2;
                    p2 = p2.next;
                }
                p = p.next;
            }
            return h.next;
        } else {
            if (list1 == null) {
                return list2;
            } else {
                return list1;
            }
        }
    }
}
