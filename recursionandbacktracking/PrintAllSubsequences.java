package com.aditya.striversvideo.recursionandbacktracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Print all possible subsequences for the array
 * @author caditya
 *
 */
public class PrintAllSubsequences {
  public void subsequences(int[] nums, int currentIndex, List<Integer> currentSubset) {
    if (currentIndex == nums.length) {
      for (var n : currentSubset) {
        System.out.print(n + " ");
      }
      if (currentSubset.size() == 0) {
        System.out.println("{}");
      }
      System.out.println();
      return;
    }
    // pick
    currentSubset.add(nums[currentIndex]);
    subsequences(nums, currentIndex + 1, currentSubset);
    // dont pick
    currentSubset.remove(currentSubset.size() - 1);
    subsequences(nums, currentIndex + 1, currentSubset);
  }

  public void subsequences(int[] nums) {
    subsequences(nums, 0, new ArrayList<>());
  }

  public static void main(String[] args) {
    int[] arr = {3, 1, 2};
    PrintAllSubsequences pas = new PrintAllSubsequences();
    pas.subsequences(arr);
  }
}
