package FourSum.Q20;
// Input: nums = [1,0,-1,0,-2,2], target = 0
//Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class method1 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        method1 m1 = new method1();
        List<ArrayList<Integer>> ls = m1.fourSum(nums, 9);
        for (ArrayList l : ls) {
            for (int i = 0; i < l.size(); i++) {
                System.out.println(l.get(i));
            }

        }
    }

    public List<ArrayList<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> returnList = new ArrayList<>();
        for (int i = 0; i < nums.length-3; i++) {
            for (int j = i + 1; j < nums.length-2; j++) {
                int start = j + 1;
                int end = nums.length - 1;
                int remain = target - (nums[i] + nums[j]);
                ArrayList<Integer> list = new ArrayList<>();
                while (end > start) {
                    if (nums[start] + nums[end] == remain) {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[start]);
                        list.add(nums[end]);
                        returnList.add(list);
                        start++;
                        end--;
                    }
                    boolean less = false;
                    boolean more = false;
                    if (nums[start] + nums[end] < remain) {
                        start++;
                        less = true;
                    }
                    if (nums[start] + nums[end] > remain) {
                        end--;
                        more = true;
                    }
                    if (less && start < end) {
                        while (nums[start] == nums[start + 1]) {
                            start++;
                        }
                    }
                    if (more && start < end) {
                        while (nums[end] == nums[end - 1]) {
                            end--;
                        }
                    }

                }
                while ((j < nums.length - 2) && nums[j] == nums[j + 1]) {
                    j++;
                }
            }
            while ((i < nums.length - 3) && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return returnList;
    }
}
