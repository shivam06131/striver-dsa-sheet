package RemoveNthNodeFromEndOfList.Q28;

//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]

public class optimizedSolution {
    public static void main(String[] args) {
        LList M0 = new LList(5, null);
        LList M1 = new LList(4, M0);
        LList M2 = new LList(3, M1);
        LList M3 = new LList(2, M2);
        LList M4 = new LList(1, M3);

        LList value = soluiton(M4 , 3);
        while (value!=null){
            System.out.println(value.val);
            value = value.next;
        }
    }

    static LList soluiton(LList head, int n) {
        LList dummy = new LList();
        dummy.next = head;
        LList fast = dummy;
        LList slow = dummy;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
