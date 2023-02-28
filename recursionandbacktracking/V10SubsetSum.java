package com.aditya.striversvideo.recursionandbacktracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a list of n integers, print sum of all subsets in it.
 * Output should be printed in increasing order of sums.
 * @author caditya
 *
 */
public class V10SubsetSum {

  public List<Integer> subsetSum(int[] arr, int index, int sum, List<Integer> sums) {
    if (index == arr.length) {
      sums.add(sum);
      return sums;
    }
    // pick 
    sum += arr[index];
    subsetSum(arr, index + 1, sum, sums);
    // dont pick
    sum -= arr[index];
    return subsetSum(arr, index + 1, sum, sums);
  }
  
  public static void main(String[] args) {
    V10SubsetSum ss = new V10SubsetSum();
    List<Integer> sums = ss.subsetSum(new int[] {3, 1, 2}, 0, 0, new ArrayList<>());
    Collections.sort(sums);
    for (Integer s : sums) {
      System.out.println(s);
    }

  }

}
