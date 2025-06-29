
// 15. 3Sum
// https://leetcode.com/problems/3sum/
// Difficulty: Medium
// Tags: Array, Two Pointers, Sorting

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ID15 {

  public static void main(String[] args) {
    int[] nums = { -1, 0, 1, 2, -1, -4 };
    ID15 solution = new ID15();
    List<List<Integer>> result = solution.threeSum(nums);
    System.out.println(result);
  }

  // Time Complexity: O(n^2)
  // Space Complexity: O(1) for the input array, O(n) for the output list
  // where n is the length of the input array.
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    List<List<Integer>> ans = new ArrayList<>();
    for (int i = 0; i < n - 2; i++) {

      if (i > 0 && nums[i - 1] == nums[i])
        continue;

      int j = i + 1;
      int k = n - 1;
      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum == 0) {
          ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
          // Skip duplicates for j and k
          while (j < k && nums[j] == nums[j + 1])
            j++;
          while (j < k && nums[k] == nums[k - 1])
            k--;

          j++;
          k--;
        } else if (sum < 0) {
          j++;
        } else {
          k--;
        }

      }
    }
    return ans;
  }

}