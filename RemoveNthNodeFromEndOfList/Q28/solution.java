package RemoveNthNodeFromEndOfList.Q28;

//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]

class LList {
    int val;
    LList next;

    LList() {
    }

    LList(int val) {
        this.val = val;
        this.next = null;
    }

    LList(int val, LList next) {
        this.val = val;
        this.next = next;
    }
}

public class solution {
    public static void main(String[] args) {
        LList M0 = new LList(5, null);
        LList M1 = new LList(4, M0);
        LList M2 = new LList(3, M1);
        LList M3 = new LList(2, M2);
        LList M4 = new LList(1, M3);


        LList x = new LList(1, null);

        LList value = answer(x, 1);
        while(value != null){
            System.out.println(value.val + " " + value.next);
            value =value.next;
        }
    }

    static LList answer(LList head, int n) {
        int count = 0;
        LList HeadTwo = head;

        while (HeadTwo != null) {
            count++;
            HeadTwo = HeadTwo.next;
        }

        int len = count - n;

        LList dummyHead = head;

        if (count == n) {
            LList list = null;
            list = dummyHead.next;
            return list;
        }

        LList headThree = head;

        int countTwo = 0;
        LList tempo = new LList();
        while (countTwo != len) {
            countTwo++;
            tempo = head;
            head = head.next;
        }
        tempo.next = tempo.next.next;

        return headThree;
    }
}
