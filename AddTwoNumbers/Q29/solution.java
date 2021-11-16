package AddTwoNumbers.Q29;

//Input: l1 = [2,4,3], l2 = [5,6,4] => 2+5 = 7 , 4+6 = 0 (carry =1) , 3+4 = (7 + 1 carry) = 8 ==> 708
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.

public class solution {
    public static void main(String[] args) {

        LList M2 = new LList(3, null);
        LList M3 = new LList(4, M2);
        LList M4 = new LList(2, M3);

        LList l2 = new LList(4, null);
        LList l3 = new LList(6, l2);
        LList l4 = new LList(5, l3);

        solution x = new solution();
        LList val = x.solution(M4, l4);

        while (val != null) {
            System.out.println(val.val);
            val = val.next;
        }
    }

    public LList solution(LList l1, LList l2) {
        LList temp = new LList();
        LList dummy = temp;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;
            LList node = new LList(sum % 10);
            temp.next = node;
            temp = temp.next;
        }
        return dummy.next;
    }
}
