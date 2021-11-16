package IntersectionOfTwoLinkedLists.Q31;

import java.util.HashSet;

//https://leetcode.com/problems/intersection-of-two-linked-lists/

//Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
//Output: Intersected at '8'
//Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
//From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes
// before the intersected node in A; There are 3 nodes before the intersected node in B.

public class method1 {
    public static void main(String[] args) {


        LList m1 = new LList(5, null);
        LList m2 = new LList(4, m1);
        LList m3 = new LList(8, m2);
        LList m4 = new LList(1, m3);
        LList m5 = new LList(4, m4);


        LList l4 = new LList(1, m3);
        LList l5 = new LList(6, l4);
        LList l6 = new LList(5, l5);

        LList value = solution(l6 , m5);
        System.out.println(value.val);
    }

    public static LList solution(LList headA, LList headB) {
        HashSet<LList> set = new HashSet<>();
        LList dummy1 = headA;
        LList dummy2 = headB;
        while (dummy1 != null) {
            set.add(dummy1);
            dummy1 = dummy1.next;
        }

        while (dummy2 != null) {
            if (set.contains(dummy2)) {
                return dummy2;
            }
            dummy2 = dummy2.next;
        }
        return null;
    }
}
