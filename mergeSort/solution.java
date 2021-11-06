package mergeSort;

public class solution {
    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 5, 1};
        int arr2[] = {1, 3, 2, 3, 1};
        int val = mergeSort(arr, 0, 4);
        mergeSort(arr, 0, 4);
       // System.out.println(val);

    }

    static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low < high) {
            int mid = (low + high) / 2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += merge(arr, low, mid, high);
        }
        return count;
    }

    static int merge(int[] arr, int low, int mid, int high) {
        int M = mid - low + 1;
        int N = high - mid;
        int count = 0;

        int[] left = new int[M];
        int[] right = new int[N];

        for (int i = 0; i < M; i++) {
            left[i] = arr[low + i];
        }

        for (int j = 0; j < N; j++) {
            right[j] = arr[mid + 1 + j];
        }
        int y = 0;

        for (int x = 0; x < left.length; x++) {
            while (y < right.length && left[x] > 2 * right[y]) {
                y++;
            }
            count += y;
        }

        int i = 0;
        int j = 0;


        while (i < M && j < N) {
            if (left[i] < right[j]) {
                arr[low] = left[i];
                i++;
            } else {
                arr[low] = right[j];
                j++;
            }
            low++;
        }
        while (i < M) {
            arr[low] = left[i];
            low++;
            i++;
        }
        while (j < N) {
            arr[low] = right[j];
            low++;
            j++;
        }
        return count;
    }

}
