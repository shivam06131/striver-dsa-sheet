package QuestionNIne;

public class solution {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2};
        solution(arr);
    }

    static void solution(int[] array) {
        int i = array.length - 2;
        if (array.length <= 1 || array == null) {
            return;
        }
        while (array[i] > array[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = array.length - 1;
            while (array[i] > array[j]) {
                j--;
            }
            swap(array, i, j);
        }
        reverse(array, i + 1, array.length - 1);

        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + " | ");
        }
    }

    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void reverse(int[] array, int i, int j) {
        while (i < j) {
            swap(array, i, j);
            j--;
            i++;
        }

    }
}
