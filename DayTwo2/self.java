package DayTwo2;

public class self {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 1, 6, 2};
        int arr2[] = {4, 3, 6, 2, 1, 1};

        int n = arr.length;
        solution(arr, n);
    }

    static void solution(int[] array, int n) {
        int xor = array[0];
        for (int i = 1; i < n; i++) {
            xor = xor ^ array[i];
        }
        for (int i = 1; i <= n; i++) {
            xor = xor ^ i;
        }
        int val = xor;
        int repeating = 0;
        int missing = 0;
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            if ((array[i] & val) != 0) {
                x = x ^ array[i];
            } else {
                y = y ^ array[i];
            }
        }

        for (int i = 1; i <= n; i++) {
            if ((i & val) != 0) {
                x = x ^ i;
            } else {
                y = y ^ i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                repeating = x;
                missing = y;
            } else if (array[i] == y) {
                repeating = y;
                missing = x;
            }
        }
        System.out.println("repeating number is " + repeating + " missing number is " + missing);
    }
}
