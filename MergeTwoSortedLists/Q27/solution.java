package MergeTwoSortedLists.Q27;

//Input: l1 = [1,2,4], l2 = [1,3,4]
//Output: [1,1,2,3,4,4]

 class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class solution {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3, null);
        ListNode l2 = new ListNode(2, l1);
        ListNode l3 = new ListNode(1, l2);

        ListNode M1 = new ListNode(4, null);
        ListNode M2 = new ListNode(3, M1);
        ListNode M3 = new ListNode(1, M2);

        ListNode value = mergeTwoLists(l3, M3);
        while (value != null) {
            System.out.println(value.val);
            value = value.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode reservedHead = new ListNode();
        while (l1 != null && l2 != null) {
            ListNode node = new ListNode();
            if (l1.val > l2.val) {
                node = l2;
                l2 = l2.next;
            } else {
                node = l1;
                l1 = l1.next;
            }

            if (head == null) {
                reservedHead = node;
                head = node;
            } else {
                head.next = node;
                head = head.next;
            }


        }
        while (l1 != null){
            ListNode node = new ListNode();
            node = l1;
            head.next = node;
            l1 = l1.next;
            head = head.next;
        }

        while (l2 != null){
            ListNode node = new ListNode();
            node = l2;
            head.next = node;
            l2 = l2.next;
            head = head.next;
        }

        return reservedHead;
    }
}
