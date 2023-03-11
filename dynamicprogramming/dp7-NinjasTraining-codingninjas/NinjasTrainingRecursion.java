import java.util.Arrays;

public class NinjasTrainingRecursion {
	// https://www.codingninjas.com/codestudio/problems/ninja-s-training_3621003

    public static int ninjaTraining(int day, int last, int[][] points) {
        if (day == 0) {
            int maxPoints = 0;
            for (int task = 0 ; task < 3 ; task++) {
                if (task != last) {
                    maxPoints = Math.max(maxPoints, points[day][task]);
                }
            }
            return maxPoints;
        }
        int maxPoints = 0;
        for (int task = 0 ; task < 3; task++) {
            if (task != last) {
                int point = points[day][task] + ninjaTraining(day - 1, task, points, dp);
                maxPoints = Math.max(maxPoints, point);
            }
        }
        return maxPoints;
    }

    public static int ninjaTraining(int n, int points[][]) {
        return ninjaTraining(n - 1, 3, points);
    }

}