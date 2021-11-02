package Question17;

public class method3 {
    public static void main(String args[]) {
        int val = solution(3,2);
        System.out.println("val " + val);
    }

    static int solution(int m, int n) {
        int[][] memorizationTable = new int[m][n];
        return helper(m-1, n-1, memorizationTable);
    }

    static int helper(int m, int n, int[][] memorizationTable) {
        if(m<0 || n<0){
            return 0;
        }
        if (m == 0 && n == 0) {
            return 1;
        }
        if (memorizationTable[m][n] != 0) {
            return memorizationTable[m][n];
        }
        return memorizationTable[m][n] = helper(m, n - 1, memorizationTable) + helper(m - 1, n, memorizationTable);
    }

}
