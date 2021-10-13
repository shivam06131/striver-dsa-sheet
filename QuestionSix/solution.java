package QuestionSix;
//method one

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        Integer[] array = {1, 3, 4, 2, 2};
        // to sort in decreasing order
       // Arrays.sort(array, (Integer a, Integer b) -> b - a);

        int[] array2 = {3, 1, 3, 4, 2};
        int val = soluiton(array2);
        System.out.println(val);
    }

    static int soluiton(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("--------------");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }

}
