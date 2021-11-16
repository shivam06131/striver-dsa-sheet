package DeleteAGivenNode.Q30;

//Input: head = [4,5,1,9], node = 5
//Output: [4,1,9]
//Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.

public class solution {
    public static void main(String[] args) {

        LList m0 = new LList(9, null);
        LList m1 = new LList(1, m0);
        LList m2 = new LList(5, m1);
        LList m3 = new LList(4, m2);

        LList val = solution(m3);

        while (val != null){
            System.out.println(val.val);
            val = val.next;
        }
    }

    public static LList solution(LList head) {
        head.val = head.next.val;
        head.next = head.next.next;

        return head;
    }
}
