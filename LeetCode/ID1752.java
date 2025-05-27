// 1752. Check if Array Is Sorted and Rotated
public class ID1752 {

  public static void main(String[] args) {
    int[] nums = { 2, 1 };
    System.out.println(check(nums));
  }

  static boolean check(int[] nums) {
    boolean isSorted = false;
    for (int i = 0; i < nums.length; i++) {
      int start = i;
      int end = (i == 0) ? nums.length - 1 : i - 1;
      int next = start + 1;
      do {
        if (next >= nums.length) {
          next = 0;
        }
        if (nums[start] <= nums[next]) {
          isSorted = true;
          start = next;
          next++;
        } else {
          isSorted = false;
          break;
        }
      } while (start != end);
      if (isSorted)
        return isSorted;
    }
    return isSorted;
  }

}
