public class TriangleMemoization {
	// https://leetcode.com/problems/triangle/

    public int minimumTotal(List<List<Integer>> triangle, int i, int j, int[][] dp) {
        if (i == triangle.size() - 1) {
            return triangle.get(i).get(j);
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int down = minimumTotal(triangle, i + 1, j, dp);
        int diagnal = minimumTotal(triangle, i + 1, j + 1, dp);
        return dp[i][j] = triangle.get(i).get(j) + Math.min(down, diagnal);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return minimumTotal(triangle, 0, 0, dp);
    }

}