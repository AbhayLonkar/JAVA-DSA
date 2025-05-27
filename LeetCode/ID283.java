// 283. Move Zeroes

import java.util.Arrays;

public class ID283 {

  public static void main(String[] args) {
    int[] arr = { 0, 1, 0, 3, 12 };
    moveZeroes(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void moveZeroes(int[] nums) {
    int nonZeroIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        swap(nums, i, nonZeroIndex);
        nonZeroIndex++;
      }
    }
  }

  static void swap(int[] nums, int f, int s) {
    int temp = nums[f];
    nums[f] = nums[s];
    nums[s] = temp;
  }
}
