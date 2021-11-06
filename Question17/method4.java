package Question17;

public class method4 {
    public static void main(String[] args) {
        int val2 = solution(3, 2);
        int val3 = solution(3, 7);
        System.out.println("val: " + val2);
    }

    static int solution(int m, int n) {
        int N = m + n - 2;
        int R = m - 1;
        double sol = 1;
        for (int i = 1; i <= R; i++) {
            sol = sol * (N + i - R) / i;
        }
        return (int) sol;
    }
}
