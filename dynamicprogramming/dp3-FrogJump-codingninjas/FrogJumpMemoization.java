public class FrogJumpMemoization {
	//https://www.codingninjas.com/codestudio/problems/frog-jump_3621012 

    public static int fJ(int index, int[] heights, int[] dp) {
        if (index == 0) {
            return 0;
        }
        if (dp[index] != -1) {
            return dp[index];
        }
        int left = fJ(index - 1, heights, dp) + Math.abs(heights[index] - heights[index - 1]);
        int right = Integer.MAX_VALUE;
        if (index > 1) {
            right = fJ(index - 2, heights, dp) + Math.abs(heights[index] - heights[index - 2]);
        }
        return dp[index] = Math.min(left, right);
    }
    public static int frogJump(int n, int heights[]) {
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return fJ(n - 1, heights, dp);
    }

}