public class FrogJumpRecursive {
	//https://www.codingninjas.com/codestudio/problems/frog-jump_3621012 

    public static int fJ(int index, int[] height) {
        if (index == 0) {
            return 0;
        }
        int left = fJ(index - 1, heights) + Math.abs(heights[index] - heights[index - 1]);
        int right = Integer.MAX_VALUE;
        if (index > 1) {
            right = fJ(index - 2, height) + Math.abs(heights[index] - heights[index - 2]);
        }
        return Math.min(left, right);
    }
	
    public static int frogJump(int n, int heights[]) {
        return fJ(n - 1, heights);
    }

}