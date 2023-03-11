public class TriangleTabulation {
	// https://leetcode.com/problems/triangle/

    public int minimumTotal(List<List<Integer>> triangle) {
        // initialize the dp
        int n = triangle.size();
        int[][] dp = new int[n][n];
        // since it is a variable base case , we have to store the last values
        for (int j = 0 ; j < n ; j++) {
            dp[n - 1][j] = triangle.get(n - 1).get(j);
        }
        // calculate from n - 2 as we already have the n-1th row precalculated
        for (int i = n - 2 ; i >= 0 ; i--) {
            for (int j = i ; j >= 0 ; j--) {
                int down = dp[i + 1][j];
                int diagnal = dp[i + 1][j + 1];
                dp[i][j] = triangle.get(i).get(j) + Math.min(down, diagnal);
            }
        }
        return dp[0][0];
    }

}