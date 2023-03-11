public class NinjasTrainingSpaceOptimized {
	// https://www.codingninjas.com/codestudio/problems/ninja-s-training_3621003
	
    public static int ninjaTraining(int n, int points[][]) {
        int[] prev = new int[4];
        prev[0] = Math.max(points[0][1], points[0][2]);
        prev[1] = Math.max(points[0][0], points[0][2]);
        prev[2] = Math.max(points[0][0], points[0][1]);
        prev[3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));

        for (int day = 1; day < n ; day++) {
            int[] temp = new int[4];
            for (int last = 0 ; last < 4; last++) {
                for (int task = 0 ; task < 3 ; task++) {
                    if (task != last) {
                        int point = points[day][task] + prev[task];
                        temp[last] = Math.max(temp[last], point);
                    }
                }
            }
            prev = temp;
        }
        return prev[3];
    }
}