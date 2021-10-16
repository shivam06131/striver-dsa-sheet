package QuestionTen;

public class solution {
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 1};
        int val = MergeSort(arr, 0, 3);
        System.out.println("Val " + val);
    }

    static int MergeSort(int[] array, int left, int right) {
        int inversion_count = 0;
        if (right > left) {
            int mid = (right + left) / 2;
            inversion_count += MergeSort(array, left, mid);
            inversion_count += MergeSort(array, mid + 1, right);
            inversion_count += Merge(array, left, mid, right);

        }
        return inversion_count;
    }

    static int Merge(int[] array, int left, int mid, int right) {
        int inversion_count = 0;
        int N1 = mid + 1 - left;
        int N2 = right - mid;

        //creating temp arrays
        int[] leftArray = new int[N1];
        int[] rightArray = new int[N2];

        //copying data into temp array
        for (int i = 0; i < N1; i++) {
            leftArray[i] = array[left + i];
        }

        for (int i = 0; i < N2; i++) {
            rightArray[i] = array[mid + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while (i < N1 && j < N2) {
            if (leftArray[i] < rightArray[j]) {
                array[k] = leftArray[i];
                k++;
                i++;
            } else {
                array[k] = rightArray[j];
                inversion_count += (mid + 1) - (left + i);
                k++;
                j++;
            }
        }
        while (i < N1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < N2) {
            array[k] = rightArray[j];
            k++;
            j++;
        }
        return inversion_count;
    }

}
