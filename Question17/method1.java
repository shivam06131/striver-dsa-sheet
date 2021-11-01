package Question17;

public class method1 {
    public static void main(String[] args) {
        int val = uniquePaths(3, 7, 0, 0);
        int val2 = uniquePaths(2, 3, 0, 0);
        int val3 = uniquePaths(3, 4, 0, 0);
        System.out.println("val: " + val3);
    }

    static int uniquePaths(int m, int n, int x, int y) {
        if (x >= m || y >= n) {
            return 0;
        }
        if (x == (m - 1) && y == (n - 1)) {
            return 1;
        } else return uniquePaths(m, n, x + 1, y) + uniquePaths(m, n, x, y + 1);
    }
}
