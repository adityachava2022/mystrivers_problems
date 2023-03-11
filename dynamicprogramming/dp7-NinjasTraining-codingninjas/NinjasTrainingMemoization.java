import java.util.Arrays;

public class NinjasTrainingMemoization {
	// https://www.codingninjas.com/codestudio/problems/ninja-s-training_3621003

    public static int ninjaTraining(int day, int last, int[][] points, int[][] dp) {
        if (day == 0) {
            int maxPoints = 0;
            for (int task = 0 ; task < 3 ; task++) {
                if (task != last) {
                    maxPoints = Math.max(maxPoints, points[day][task]);
                }
            }
            return maxPoints;
        }
        if (dp[day][last] != -1) {
            return dp[day][last];
        }
        int maxPoints = 0;
        for (int task = 0 ; task < 3; task++) {
            if (task != last) {
                int point = points[day][task] + ninjaTraining(day - 1, task, points, dp);
                maxPoints = Math.max(maxPoints, point);
            }
        }
        return dp[day][last] = maxPoints;
    }

    public static int ninjaTraining(int n, int points[][]) {
        // dp solution
        int[][] dp = new int[n][4];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return ninjaTraining(n - 1, 3, points, dp);
    }

}