// 496. Next Greater Element I

import java.util.Arrays;

public class ID496 {
  public static void main(String[] args) {
    int[] nums1 = { 4, 1, 2 };
    int[] nums2 = { 1, 3, 4, 2 };
    System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
  }

  // Brute Force Solution
  static int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] ans = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
      for (int j = 0; j < nums2.length; j++) {
        if (nums2[j] == nums1[i]) {
          int max = nums2[j];
          for (int k = j; k < nums2.length; k++) {
            if (nums2[k] > max) {
              max = nums2[k];
              break;
            }
          }
          if (max == nums2[j]) {
            ans[i] = -1;
          } else {
            ans[i] = max;
          }
        }
      }
    }
    return ans;
  }
}
