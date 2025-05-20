// Bubble sort method with O(n) - time complexity

import java.util.Arrays;

public class bubbleSort {
  public static void main(String[] args) {
    int[] arr = { 4, 3, 68, 12, 0, -4, 43, 7, 1 };
    bubble_sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void bubble_sort(int[] arr) {
    boolean swapped;
    // run the steps n-1 times
    for (int i = 0; i < arr.length; i++) {
      swapped = false;
      // for each step, max item will come at the last respective index
      for (int j = 1; j < arr.length - i; j++) {
        // swap if the item is smaller than the previous item
        if (arr[j] < arr[j - 1]) {
          // swap
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
          swapped = true;
        }
      }
      // if you did not swap for a particular value of i, it means the array is sorted
      // hence stop/break the loop
      if (!swapped)
        break;
    }
  }
}
