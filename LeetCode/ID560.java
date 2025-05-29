// 560. Subarray Sum Equals K

import java.util.*;

public class ID560 {
  /*
   * Solved using Brute Force
   * 
   * Time Complexity: O(n^2)
   * Space Complexity: O(1)
   */
  public static void main(String args[]) {
    int[] nums = { 1, 2, 3 };
    int k = 3;
    System.out.println(subarraySum2(nums, k));
  }

  // Brute Force
  static int subarraySum1(int[] nums, int k) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      int sum = 0;
      for (int j = i; j < nums.length; j++) {
        sum += nums[j];
        if (sum == k) {
          count++;
        }
      }
    }
    return count;
  }

  // Optimized
  static int subarraySum2(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    int count = 0, prefixSum = 0;

    for (int i = 0; i < nums.length; i++) {
      prefixSum += nums[i];
      int remove = prefixSum - k;
      count += map.getOrDefault(remove, 0);
      map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
    }
    return count;
  }

}
