package QuestionFour;

public class MaxSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] num2 = {5,4,-1,7,8};
        solution(nums);
    }

    static void solution(int[] array) {
        int sum = array[0];
        int max = 0;
        for (int i = 1; i < array.length; i++) {
            if (sum + array[i] < 0) {
                sum = 0;
            } else {
                sum = sum + array[i];
            }
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
