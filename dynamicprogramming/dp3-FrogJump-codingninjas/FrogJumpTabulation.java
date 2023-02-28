public class FrogJumpTabulation {
	//https://www.codingninjas.com/codestudio/problems/frog-jump_3621012 

    public static int frogJump(int n, int heights[]) {
        // bottom up approach
        int[] dp = new int[n];
        // S1: initialize base case
		dp[0] = 0;
        for (int i = 1 ; i < n ; i++) {
            int l = dp[i - 1] + Math.abs(heights[i] - heights[i - 1]);
            int r = Integer.MAX_VALUE;
            if (i > 1) {
                r = dp[i - 2] + Math.abs(heights[i] - heights[i - 2]);
            }
            dp[i] = Math.min(l, r);
        }
        return dp[n - 1];
    }

}