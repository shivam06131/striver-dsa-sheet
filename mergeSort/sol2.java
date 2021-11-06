package mergeSort;

public class sol2 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 3, 5, 1};
        int arr2[] = {1, 3, 2, 3, 1};
        int arr3[] = {2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647};
        //int val = reversePairs(arr);
        //System.out.println(val);
        //System.out.println(reversePairs(arr));
        int val = reversePairs(arr3);
        System.out.println(val);
    }

    public static int reversePairs(int[] nums) {
        int val = mergeSort(nums, 0, nums.length - 1);
        return val;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low < high) {
            int mid = (low + high) / 2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += merge(arr, low, mid, high);
        }
        return count;
    }

    public static int merge(int[] arr, int low, int mid, int high) {
        int N1 = mid - low + 1;
        int N2 = high - mid;
        int count = 0;

        //creating temporary arr
        int[] left = new int[N1];
        int[] right = new int[N2];

        //filling temporary arrs

        for (int i = 0; i < N1; i++) {
            left[i] = arr[low + i];
        }

        for (int j = 0; j < N2; j++) {
            // right[j] =  Long.valueOf(arr[mid + 1 + j]);
            right[j] = arr[mid + 1 + j];
        }
        int y = 0;
        //int loop = 0;
        //  for (int i = 0; i < left.length; i++) {
        //     while ((loop < right.length)) {
        //         System.out.println(left[i] > (2 * Long.valueOf(right[y])));
        //          if (left[i] > (2 * Long.valueOf(right[y]))) {
        //             y++;
        //          }
        //          loop++;
        //     }
        //     count += y;
        //  }
        for (int i = 0; i < left.length; i++) {
            while (y < right.length && left[i] > 2 * Long.valueOf(right[y])) {
                y++;
            }
            count += y;
        }

        int i = 0;
        int j = 0;
        int k = low;

        while (i < N1 && j < N2) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = (int) right[j];
                j++;
            }
            k++;
        }
        while (i < N1) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < N2) {
            arr[k] = right[j];
            k++;
            j++;
        }
        return count;
    }
}
