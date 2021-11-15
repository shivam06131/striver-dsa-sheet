package MergeTwoSortedLists.Q27;

//Input: l1 = [1,2,4], l2 = [1,3,4]
//Output: [1,1,2,3,4,4]

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

public class efficientSolution {
    public static void main(String[] args) {
        LList l1 = new LList(9, null);
        LList l2 = new LList(7, l1);
        LList l3 = new LList(5, l2);

        LList M0 = new LList(10, null);
        LList M1 = new LList(8, M0);
        LList M2 = new LList(4, M1);
        LList M3 = new LList(3, M2);


        LList value = solution(l3 , M3);
        while (value!=null){
            System.out.println(value.val);
            value =value.next;
        }
    }


    static LList solution(LList l1, LList l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val > l2.val) {
            LList temp = l1;
            l1 = l2;
            l2 = temp;
        }

        LList firstNode = l1;
        while (l1 != null && l2 != null) {
            LList temp = null;
            while (l1 != null && l2.val > l1.val) {
                temp = l1;
                l1 = l1.next;
            }
            LList newTemp = l1;
            l1 = l2;
            l2 = newTemp;

            temp.next = l1;
        }
        return firstNode;
    }

}
