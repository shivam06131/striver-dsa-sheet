package one;

public class methodTwo {
    public static void main(String[] args) {
        int[] array = {2, 0, 2, 1, 1, 0};
        int[] val = solution(array);
        for (int i = 0; i < val.length; i++) {
            System.out.println(val[i]);
        }
    }

    static int[] solution(int[] nums) {
        int mid = 0;
        int low = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
        }

        return nums;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
