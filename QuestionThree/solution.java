package QuestionThree;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        // int ar1[] = {1, 5, 9, 10, 15, 20};
        //  int ar2[] = {2, 3, 8, 13};

        int ar1[] = {10};
        int ar2[] = {2, 3};
        answer(ar1, ar2);
    }

    static void answer(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[0]) {
                swap(arr1, arr2, i);
                Arrays.sort(arr2);
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" " + arr1[i]);
        }
        System.out.println(" --------- ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(" " + arr2[i]);
        }

    }

    static void swap(int[] arrOne, int[] arrTwo, int index) {
        int temp = arrTwo[0];
        arrTwo[0] = arrOne[index];
        arrOne[index] = temp;
    }

}
