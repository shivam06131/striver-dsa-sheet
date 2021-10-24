package QuestionFifteen;


import java.util.Arrays;

public class methodOne {
    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int[] arr2 = {3,2,3};
        int[] arr3 = {2,2};
        int val = solution(arr3);
        System.out.println("val " + val);
    }

    static int solution(int[] nums) {
        int length = nums.length;
        if(length == 1){
            return nums[0];
        }
        int half = 0;
        Arrays.sort(nums);
        if (length % 2 == 0) {
            half = length / 2;
        } else {
            half = (length / 2) + 1;
        }
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                count = 0;
            }
            if (count >= half-1) {
                return nums[i];
            }
        }
        return 0;

    }
}
