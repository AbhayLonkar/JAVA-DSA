
// 1. Two Sum
import java.util.*;

public class ID1 {

  public static void main(String args[]) {
    int[] nums = { 2, 7, 11, 15 };
    int target = 9;
    ID1 solution = new ID1();
    System.out.println(Arrays.toString(solution.twoSum(nums, target)));
  }

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> pairs = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      if (pairs.containsKey(target - num)) {
        return new int[] { i, pairs.get(target - num) };
      }
      pairs.put(num, i);
    }
    return new int[] {};
  }
}