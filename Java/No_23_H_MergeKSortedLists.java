class ListNode {
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

public class No_23_H_MergeKSortedLists {
    public static void main(String[] args) {
        No_23_H_MergeKSortedLists mergeKSortedLists = new No_23_H_MergeKSortedLists();

        ListNode[] lists = new ListNode[3];

        ListNode node13 = new ListNode(5, null);
        ListNode node12 = new ListNode(4, node13);
        ListNode node11 = new ListNode(1, node12);

        ListNode node23 = new ListNode(6, null);
        ListNode node22 = new ListNode(3, node23);
        ListNode node21 = new ListNode(1, node22);

        ListNode node32 = new ListNode(4, null);
        ListNode node31 = new ListNode(2, node32);

        lists[0] = node11;
        lists[1] = node21;
        lists[2] = node31;

        ListNode node = mergeKSortedLists.mergeKLists(lists);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode head = new ListNode();
        ListNode node = head;

        while (true) {
            ListNode min = null;
            int x = 0;
            for (int i = 0; i < lists.length; i++) {
                if (min == null && lists[i] != null) {
                    min = lists[i];
                }
                if (lists[i] != null && lists[i].val <= min.val) {
                    min = lists[i];
                    x = i;
                }
            }
            node.next = min;
            if (min == null) {
                break;
            }
            node = node.next;
            lists[x] = min.next;
        }

        return head.next;
    }
}
