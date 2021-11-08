package LargestSubarrayZerroSum.Q22;

import java.util.HashMap;
import java.util.Map;

public class solution {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        int[] arr2 = {1, -1, 3, -8, 1, 7, 10, 23};
        solution s1 = new solution();
        int val = s1.maxLen(arr, 8);
        System.out.println(val);
    }

    int maxLen(int arr[], int n) {
        // Your code here
        int maxLength = 0;
        int sum = 0;
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxLength = Math.max((i + 1), maxLength);
            }
            if (hash.containsKey(sum)) {
                maxLength = Math.max((i + 1) - hash.get(sum), maxLength);
            } else {
                hash.put(sum, i + 1);
            }
        }
        return maxLength;
    }
}
