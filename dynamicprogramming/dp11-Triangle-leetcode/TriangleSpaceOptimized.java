public class TriangleSpaceOptimized {
	// https://leetcode.com/problems/triangle/

    /**
    space optimized solution - if we observe
    we only need the previous row and current row in the entire matrix
    */
    public int minimumTotal(List<List<Integer>> triangle) {
        // initialize the dp
        int n = triangle.size();
        int[] prev = new int[n];
        // since it is a variable base case , we have to store the last values
        for (int j = 0 ; j < n ; j++) {
            prev[j] = triangle.get(n - 1).get(j);
        }
        // calculate from n - 2 as we already have the n-1th row precalculated
        for (int i = n - 2 ; i >= 0 ; i--) {
            int[] curr = new int[i + 1];
            for (int j = i ; j >= 0 ; j--) {
                int down = prev[j];
                int diagnal = prev[j + 1];
                curr[j] = triangle.get(i).get(j) + Math.min(down, diagnal);
            }
            prev = curr;
        }
        return prev[0];
    }

}