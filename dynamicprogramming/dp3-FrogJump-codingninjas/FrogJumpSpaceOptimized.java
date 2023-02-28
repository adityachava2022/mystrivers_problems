public class FrogJumpSpaceOptimized {
	//https://www.codingninjas.com/codestudio/problems/frog-jump_3621012 

    public static int frogJump(int n, int heights[]) {
		// space optimized approach
        int prev = 0;
        int prev2 = 0;
        for (int i = 1 ; i < n ; i++) {
            int l = prev + Math.abs(heights[i] - heights[i - 1]);
            int r = Integer.MAX_VALUE;
            if (i > 1) {
                r = prev2 + Math.abs(heights[i] - heights[i - 2]);
            }
            int curri = Math.min(l, r);
            prev2 = prev;
            prev = curri;
        }
        return prev;
    }

}