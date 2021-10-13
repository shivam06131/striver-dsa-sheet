package QuestionSix;

import java.util.HashSet;
import java.util.Set;

public class methodTwo {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 2, 2};
        int[] array2 = {3, 1, 3, 4, 2};
        int val = solution(array2);
        System.out.println("val: " + val);
    }

    static int solution(int[] arr) {
        Set<Integer> s1 = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (s1.contains(arr[i])) {
                return arr[i];
            } else {
                s1.add(arr[i]);
            }
        }
        return -1;
    }
}
