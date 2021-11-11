package ReverseLinkedList.Q25;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }



    ListNode(int value) {
        this.val = value;
        this.next = null;

    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class solution {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, null);
        ListNode l2 = new ListNode(2, l1);
        ListNode l3 = new ListNode(3, l2);
        ListNode l4 = new ListNode(4, l3);
        ListNode l5 = new ListNode(5, l4);

        // l1.next = l2;
        // l2.next = l3;
        //  l3.next = l4;
        //  l4.next = l5;
        //  l5.next = null;


        //printing linked list
        ListNode head1 = l5;
        while (head1 != null) {
            System.out.print(head1.val + " ");
            head1 = head1.next;
        }
        System.out.println(" ");


        //calling funcion
        ListNode val = solution(l5);
        ListNode head = val;

        //printing reversed linked list
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    static ListNode solution(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }

}
