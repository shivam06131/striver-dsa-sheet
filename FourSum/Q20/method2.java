package FourSum.Q20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class method2 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int[] nums2 = {1, 0, -1, 0, -2, 2};
        method2 m1 = new method2();
        List<ArrayList<Integer>> l1 = m1.solution(nums2, 0);

        for (ArrayList l : l1) {
            for (int i = 0; i < l.size(); i++) {
                System.out.print(l.get(i) + " ");
            }
            System.out.println(" ");
        }
    }

    public List<ArrayList<Integer>> solution(int[] nums, int target) {
        List<ArrayList<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int start = j + 1;
                int end = nums.length - 1;
                int target2 = target - (nums[i] + nums[j]);

                while (start < end) {
                    if (nums[start] + nums[end] < target2) {
                        start++;
                    } else if (nums[start] + nums[end] > target2) {
                        end--;
                    }
                    if (nums[start] + nums[end] == target2) {
                        ArrayList<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[start]);
                        quad.add(nums[end]);
                        list.add(quad);

                        while (start < end && nums[start] == quad.get(2)) {
                            start++;
                        }

                        while (start < end && nums[end] == quad.get(3)) {
                            end--;
                        }
                    }
                }
                while (j + 1 < nums.length && nums[j] == nums[j + 1]) {
                    j++;
                }
            }
            while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return list;
    }
}
