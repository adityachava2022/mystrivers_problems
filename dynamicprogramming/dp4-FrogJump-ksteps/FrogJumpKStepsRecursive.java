public class FrogJumpKStepsRecursive {
	//https://www.codingninjas.com/codestudio/problems/frog-jump_3621012 

    public static int fJ(int index, int k, int[] height) {
        if (index == 0) {
            return 0;
        }
		int minJumps = Integer.MAX_VALUE;
		for (int i = 1 ; i <= k ;i++) {
			if (index > k - 1) {
				int ci = fJ(index - k, heights) + Math.abs(heights[index] - heights[index - k);
				minJumps = Math.min(minJumps, ci);
			}
		}
        return minJumps;
    }
	
    public static int frogJumpKSteps(int n, int k, int heights[]) {
        return fJ(n - 1, k, heights);
    }

}