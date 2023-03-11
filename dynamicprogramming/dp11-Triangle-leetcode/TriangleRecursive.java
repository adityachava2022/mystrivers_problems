public class TriangleRecursive {
	// https://leetcode.com/problems/triangle/

    public int minimumTotal(List<List<Integer>> triangle, int i, int j) {
        if (i == triangle.size() - 1) {
            return triangle.get(i).get(j);
        }
        int down = minimumTotal(triangle, i + 1, j);
        int diagnal = minimumTotal(triangle, i + 1, j + 1);
        return triangle.get(i).get(j) + Math.min(down, diagnal);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        return minimumTotal(triangle, 0, 0);
    }

}