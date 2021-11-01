package Question17;

import java.util.ArrayList;

public class method2 {
    public static void main(String[] args) {
        int val2 = dpUniquePaths(2, 3);
        int val3 = dpUniquePaths(3, 7);
        System.out.println("val: " + val3);
    }
    static int dpUniquePaths(int m, int n){
        int x = 0;
        int y = 0;
        int[][] dp = new int[m][n];
        return uniquePaths( m,  n,  x,  y , dp);
    }

    static int uniquePaths(int m, int n, int x, int y , int[][] dp) {
        if (x >= m || y >= n) {
            return 0;
        }
        if (x == (m - 1) && y == (n - 1)) {
            return 1;
        }
        if(dp[x][y] != 0){
            return dp[x][y];
        }
        else return dp[x][y] =  uniquePaths(m, n, x + 1, y , dp) + uniquePaths(m, n, x, y + 1 ,dp);
    }
}
