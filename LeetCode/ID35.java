// 35. Search Insert Position

public class ID35 {
  public static void main(String args[]) {
    ID35 solution = new ID35();
    int[] nums = { 1, 3, 5, 6 };
    int target = 5;
    System.out.println(solution.searchInsert(nums, target)); // Output: 2
    target = 2;
    System.out.println(solution.searchInsert(nums, target)); // Output: 1
    target = 7;
    System.out.println(solution.searchInsert(nums, target)); // Output: 4
    target = 0;
    System.out.println(solution.searchInsert(nums, target)); // Output: 0
  }

  public int searchInsert(int[] nums, int target) {
    int n = nums.length;
    int start = 0;
    int end = nums.length - 1;
    if (target > nums[end])
      return end + 1;
    if (target < nums[start])
      return 0;
    int mid = -1;
    while (start < end) {
      mid = end - (end - start) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    if (nums[start] >= target)
      return start;
    else
      return start + 1;
  }
}