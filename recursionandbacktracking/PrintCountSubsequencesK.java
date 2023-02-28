package com.aditya.striversvideo.recursionandbacktracking;

/**
 * Print count of subsequences whose sum is k
 * 
 * @author caditya
 */
public class PrintCountSubsequencesK {
  public int subsequencesK(int[] nums, int k, int currentIndex, int currentSum) {
    if (currentIndex == nums.length) {
      if (currentSum == k) {
        return 1;
      } else {
        return 0;
      }
    }
    // pick
    currentSum += nums[currentIndex];
    int l = subsequencesK(nums, k, currentIndex + 1, currentSum);
    // dont pick
    currentSum -= nums[currentIndex];
    int r = subsequencesK(nums, k, currentIndex + 1, currentSum);
    return l + r;
  }

  public int subsequencesK(int[] nums, int k) {
    return subsequencesK(nums, k, 0, 0);
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 1};
    int k = 2;
    PrintCountSubsequencesK psk = new PrintCountSubsequencesK();
    int r = psk.subsequencesK(arr, k);
    System.out.println("result  is " + r);
  }
}
