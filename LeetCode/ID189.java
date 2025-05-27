// 189. Rotate Array

import java.util.Arrays;

public class ID189 {
  public static void main(String args[]) {
    int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
    int k = 3;
    rotate(nums, k);
    System.out.println(Arrays.toString(nums));
  }

  static void rotate(int[] nums, int k) {
    int len = nums.length;
    if (len == 1 || len == 0)
      return;
    k = k % len;
    int[] temp = new int[k];
    int count = 0;
    for (int i = len - k; i < len; i++) {
      temp[count] = nums[i];
      count++;
    }
    for (int i = len - k - 1; i >= 0; i--) {
      swap(nums, i, i + k);
    }
    for (int i = 0; i < temp.length; i++) {
      nums[i] = temp[i];
    }
  }

  static void swap(int[] nums, int f, int s) {
    int t = nums[f];
    nums[f] = nums[s];
    nums[s] = t;
  }

}