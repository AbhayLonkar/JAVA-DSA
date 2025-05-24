// Insertion sort with time complexity O(n^2)

import java.util.Arrays;

public class insertionSort {
  public static void main(String[] args) {
    int[] arr = { 1, 0, -4, 5, -3, -67, -12, 0, 234 };
    insertion_sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void insertion_sort(int[] arr) {
    // Run the loop from 0 to arr.length - 1
    for (int i = 0; i < arr.length - 1; i++) {
      // Run the inner loop from i+1 to 0
      for (int j = i + 1; j > 0; j--) {
        // If the current element is less than the previous element, swap them
        if (arr[j] < arr[j - 1]) {
          swap(arr, j, j - 1);
        } else {
          break;
        }
      }
    }
  }

  static void swap(int[] arr, int first, int second) {
    // Swap the elements
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}
