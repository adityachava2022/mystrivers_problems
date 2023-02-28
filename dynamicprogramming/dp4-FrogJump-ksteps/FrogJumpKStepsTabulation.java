public class FrogJumpKStepsTabulation {
	//https://www.codingninjas.com/codestudio/problems/frog-jump_3621012 

    public static int frogJump(int n, int k, int heights[]) {
        // bottom up approach
        int[] dp = new int[n];
        // S1: initialize base case
		dp[0] = 0;
        for (int i = 1 ; i < n ; i++) {
			int minJumps = Integer.MAX_VALUE;
			for (int j = 1 ; j <= k ; j++) {
				if (i > k - 1) {
					int ci = dp[i - j] + Math.abs(heights[i] - heights[i - j], dp);
					minJumps = Math.min(minJumps, ci);
				}
			}
        }
        return dp[n - 1];
    }

}