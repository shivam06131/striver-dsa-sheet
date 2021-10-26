package QuestionFifteen;

import java.util.HashMap;
import java.util.Map;

public class method3 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int[] arr2 = {3,2,3};
        solution(arr2);
    }

    static void solution(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int high = 0;
        int val = 0;
        int count = 0;
        for (Integer set : map.keySet()) {
            // System.out.print(set + " : ");
            // System.out.print(map.get(set));
            // System.out.println(" ");
            if (count < 1) {
                high = map.get(set);
                val = set;
                count++;
            }
            if (high < map.get(set)) {
                high = map.get(set);
                val = set;
            }

        }
        System.out.println("val : " + val);
    }
}
