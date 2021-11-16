package AddTwoNumbers.Q29;

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

