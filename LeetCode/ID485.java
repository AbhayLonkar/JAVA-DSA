// 485. Max Consecutive Ones
package LeetCode;

public class ID485 {

  public static void main(String[] args) {
    int[] arr = { 1, 1, 0, 1, 1, 1 };
    System.out.println(findMaxConsecutiveOnes(arr));
  }

  static int findMaxConsecutiveOnes(int[] nums) {
    int max = 0, counter = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        counter++;
        if (counter > max) {
          max = counter;
        }
      } else {
        counter = 0;
      }
    }
    return max;
  }
}
