// 1299. Replace Elements with Greatest Element on Right Side

import java.util.Arrays;

public class ID1299 {
  public static void main(String[] args) {
    int[] arr = { 17, 18, 5, 4, 6, 1 };
    System.out.println(Arrays.toString(replaceElements1(arr)));

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
}