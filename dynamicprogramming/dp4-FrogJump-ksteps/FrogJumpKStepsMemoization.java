public class FrogJumpKStepsMemoization {
	//https://www.codingninjas.com/codestudio/problems/frog-jump_3621012 

    public static int fJ(int index, intk, int[] heights, int[] dp) {
        if (index == 0) {
            return 0;
        }
        if (dp[index] != -1) {
            return dp[index];
        }
		int minJumps = Integer.MAX_VALUE;
		for (int i = 1 ; i <= k ;i++) {
			if (index > k - 1) {
				int ci = fJ(index - k, heights, dp) + Math.abs(heights[index] - heights[index - k], dp);
				minJumps = Math.min(minJumps, ci);
			}
		}
        return dp[index] = minJumps;
    }
    public static int frogJump(int n, int heights[]) {
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return fJ(n - 1, k, heights, dp);
    }

}