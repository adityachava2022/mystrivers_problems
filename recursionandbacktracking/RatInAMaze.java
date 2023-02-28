package com.aditya.striversvideo.recursionandbacktracking;

import java.util.ArrayList;

public class RatInAMaze {

   public static void findPath(int[][] m, int n, int r, int c, String p, boolean[][] visited, 
       ArrayList<String> res, int[][] dir) {
       if (r == n - 1 && c == n - 1) {
           res.add(p);
           return;
       }
       String direction = "DLRU";
       for (int i = 0 ; i < 4 ; i++) {
           int nextr = r + dir[i][0];
           int nextc = c + dir[i][1];
           if (nextr >= 0 && nextr < n && nextc >=0 && nextc < n && !visited[nextr][nextc] && m[nextr][nextc] == 1) {
               visited[r][c] = true;
               findPath(m, n, nextr, nextc, p + direction.charAt(i), visited, res, dir);
               visited[r][c] = false;
           }
       }
   }
   
   public static ArrayList<String> findPath(int[][] m, int n) {
       ArrayList<String> res = new ArrayList<>();
       boolean[][] visited = new boolean[n][n];
       int[][] dir = {{1, 0}, {0, -1}, {0, 1}, {-1, 0}};
       if (m[0][0] == 1)
           findPath(m, n, 0, 0, "", visited, res, dir);
       return res;
   }

  public static void main(String[] args) {
    int[][] m = {
        {1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}
    };
     System.out.println(findPath(m, 4));
  }

}
