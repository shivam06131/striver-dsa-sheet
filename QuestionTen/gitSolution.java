package QuestionTen;

public class gitSolution {
    public static void main(String[] args) {
        int[] array = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] array2 = {8, 4, 2, 1};
        int val = mergeSort(array2, 0, 3);
        //int val = mergeSort(array2, 0, 7);
        System.out.println(val);
    }

    static int mergeSort(int[] arr, int left, int right) {
        int inversion_count = 0;
        if (right > left) {
            int mid = (right + left) / 2;

            inversion_count += mergeSort(arr, left, mid);
            inversion_count += mergeSort(arr, mid + 1, right);
            inversion_count += merge(arr, left, mid, right);
        }
        return inversion_count;
    }

    static int merge(int[] arr, int left, int mid, int right) {
        int inversion_count = 0;

        //size of new temporary arrays
        int N1 = mid + 1 - left;
        int N2 = right - mid;

        //creating new temp arrays
        int[] leftArray = new int[N1];
        int[] rightArray = new int[N2];

        //copying main array data into temp array
        for (int i = 0; i < N1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int i = 0; i < N2; i++) {
            rightArray[i] = arr[mid + 1 + i];
        }
        //merging and sorting both temporary arrays
        int i = 0;
        int j = 0;
        int k = left;
        while (i < N1 && j < N2) {
            if (leftArray[i] > rightArray[j]) {
                arr[k] = rightArray[j];
                j++;
                k++;
                inversion_count += (mid + 1) - (left + i);
            } else {
                arr[k] = leftArray[i];
                i++;
                k++;
            }
        }
        while (i < N1) {
            arr[k] = leftArray[i];
            k++;
            i++;
        }
        while (j < N2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
        return inversion_count;
    }
}
