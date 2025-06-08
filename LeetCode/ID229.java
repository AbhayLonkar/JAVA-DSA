// 229. Majority Element II

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ID229 {
  public static void main(String[] args) {
    ID229 solution = new ID229();
    int[] arr = { 3, 2, 3 };
    int[] arr1 = { 1 };
    int[] arr2 = { 1, 2 };
    System.out.println(solution.majorityElement(arr)); // Output: [3]
    System.out.println(solution.majorityElement(arr1)); // Output: [1]
    System.out.println(solution.majorityElement(arr2)); // Output: [1,2]
  }

  public List<Integer> majorityElement(int[] nums) {
    int n = nums.length;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < n; i++) {
      if (map.containsKey(nums[i])) {
        map.put(nums[i], map.get(nums[i]) + 1);
      } else {
        map.put(nums[i], 1);
      }
    }
    List<Integer> list = new ArrayList<Integer>();
    for (Map.Entry<Integer, Integer> entries : map.entrySet()) {
      if (entries.getValue() > n / 3) {
        list.add(entries.getKey());
      }
    }
    return list;
  }
}
