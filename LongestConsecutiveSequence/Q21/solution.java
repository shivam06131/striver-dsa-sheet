package LongestConsecutiveSequence.Q21;

// Longest Consecutive Sequence

//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

import java.util.HashSet;

public class solution {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        int[] arr2 = {0,3,7,2,5,8,4,6,0,1};
        int val = solution(arr2);
        System.out.println(val);
    }

    static int solution(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        int mainCount = 0;
        for (int x : nums) {
            hash.add(x);
        }
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            int count = 1;
            if (!hash.contains(element - 1)) {
                while (hash.contains(element + 1)) {
                    count++;
                    element = element + 1;
                }
            }
            mainCount = Math.max(count, mainCount);
        }
        return mainCount;
    }
}
