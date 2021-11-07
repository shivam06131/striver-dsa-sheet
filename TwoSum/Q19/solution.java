package TwoSum.Q19;

import java.util.HashMap;

public class solution {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] nums2 = {3,2,4};
        int[] val = solution(nums2, 6);
        for (int x : val){
            System.out.print(x + " ");
        }
    }

    static int[] solution(int[] nums, int target) {
        int[] returnArr = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int newTarget = target - nums[i];
            if (hash.containsKey(newTarget)) {
                returnArr[1] = i;
                returnArr[0] = hash.get(newTarget);
            } else {
                hash.put(nums[i], i);
            }
        }
        return returnArr;
    }


}
