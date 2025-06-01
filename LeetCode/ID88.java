// 88. Merge Sorted Array

import java.util.Arrays;

public class ID88 {
  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 3, 0, 0, 0 };
    int m = 3, n = 3;
    int[] nums2 = { 2, 5, 6 };
    merge(nums1, m, nums2, n);
    System.out.println(Arrays.toString(nums1)); // Output: [1, 2, 2, 3, 5, 6]
  }

  static void merge(int[] nums1, int m, int[] nums2, int n) {
    for (int i = 0; i < nums2.length; i++) {
      nums1[m + i] = nums2[i];
    }
    Arrays.sort(nums1);
  }

}
