// 1299. Replace Elements with Greatest Element on Right Side

import java.util.Arrays;

public class ID1299 {
  public static void main(String[] args) {
    int[] arr = { 17, 18, 5, 4, 6, 1 };
    // [18,6,6,6,1,-1]
    // System.out.println(Arrays.toString(replaceElements1(arr)));
    System.out.println(Arrays.toString(replaceElements2(arr)));

  }

  // Brute Force Approach
  // Time Complexity: O(n^2)
  static int[] replaceElements1(int[] arr) {

    if (arr.length == 1) {
      arr[0] = -1;
      return arr;
    }

    for (int i = 0; i < arr.length - 1; i++) {
      int max = arr[i + 1];
      for (int j = i + 1; j < arr.length; j++) {
        if (max <= arr[j]) {
          max = arr[j];
        }
      }
      arr[i] = max;
    }
    arr[arr.length - 1] = -1;
    return arr;
  }

  // Optimized Approach
  static int[] replaceElements2(int[] arr) {
    if (arr.length == 1) {
      arr[0] = -1;
      return arr;
    }

    int max = arr[arr.length - 1];
    arr[arr.length - 1] = -1; // Last element is always -1
    for (int i = arr.length - 2; i >= 0; i--) {
      if (arr[i] > max) {
        int temp = arr[i];
        arr[i] = max;
        max = temp;
      } else {
        arr[i] = max;
      }
    }

    return arr;
  }

}