package com.aditya.striversvideo.recursionandbacktracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Print subsequences whose sum is k
 * 
 * @author caditya
 */
public class PrintSubsequencesK {
  public void subsequencesK(int[] nums, int k, int currentIndex, int currentSum,
      List<Integer> currentSubset) {
    if (currentIndex == nums.length) {
      if (currentSum == k) {
        for (int n : currentSubset) {
          System.out.print(n + " ");
        }
        System.out.println();
      }
      return;
    }
    // pick
    currentSubset.add(nums[currentIndex]);
    currentSum += nums[currentIndex];
    subsequencesK(nums, k, currentIndex + 1, currentSum, currentSubset);
    // dont pick
    currentSubset.remove(currentSubset.size() - 1);
    currentSum -= nums[currentIndex];
    subsequencesK(nums, k, currentIndex + 1, currentSum, currentSubset);
  }

  public void subsequencesK(int[] nums, int k) {
    subsequencesK(nums, k, 0, 0, new ArrayList<>());
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 1};
    int k = 2;
    PrintSubsequencesK psk = new PrintSubsequencesK();
    psk.subsequencesK(arr, k);
  }
}
