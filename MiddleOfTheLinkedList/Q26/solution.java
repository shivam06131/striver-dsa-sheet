package MiddleOfTheLinkedList.Q26;

//method one :- we can first itrate through linkedlist and get the
// length of the ll , and then again itrate and return the node at (length/2)+1


//method two :- by using tortoise technique, where there would be 2 (fast and slow)
// counter, and fast would move 2 steps and slow will move 1 step and by the time fast
// reaches end slow will be at middle counter

public class solution {
    static class ListNode {
        int data;
        ListNode next;

        ListNode() {
        }

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode l0 = new ListNode(6, null);
        ListNode l1 = new ListNode(5, l0);
        ListNode l2 = new ListNode(4, l1);
        ListNode l3 = new ListNode(3, l2);
        ListNode l4 = new ListNode(2, l3);
        ListNode l5 = new ListNode(1, l4);

        ListNode val = solution(l5);

        ListNode newHead = val;

        while (newHead != null) {
            System.out.println(newHead.data);
            newHead = newHead.next;
        }
    }


    static ListNode solution(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
