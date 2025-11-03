import java.util.Arrays;

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int min = Integer.MAX_VALUE;
        int[][] dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        for (int j = 0; j < n; j++) {
            min = Math.min(min, helper(matrix, dp, n - 1, j));
        }
        return min;
    }
    private int helper(int[][] matrix, int[][] dp, int i, int j) {
        int n = matrix.length;
        if (j < 0 || j >= n) return Integer.MAX_VALUE;
        if (i == 0) return matrix[0][j];
        if (dp[i][j] != Integer.MAX_VALUE) return dp[i][j];
        int up = helper(matrix, dp, i - 1, j);
        int upLeft = helper(matrix, dp, i - 1, j - 1);
        int upRight = helper(matrix, dp, i - 1, j + 1);
        dp[i][j] = matrix[i][j] + Math.min(up, Math.min(upLeft, upRight));
        return dp[i][j];
    }
}
