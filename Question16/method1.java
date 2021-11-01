package Question16;
//majority elements 1/3 times
//method one :- using frequency array

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class method1 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int[] arr1 = {2, 2, 2, 3, 3, 2, 3, 1, 3};
        int[] arr2 = {3, 2, 3};
        List<Integer> list = majorityElement(arr2);
        for (Integer x : list){
            System.out.println("x " + x);
        }
    }

    static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int oneThird = nums.length / 3;

        for (Integer x : map.keySet()) {
            if (map.get(x) > oneThird) {
                list.add(x);
            }
        }
        return list;
    }

}
