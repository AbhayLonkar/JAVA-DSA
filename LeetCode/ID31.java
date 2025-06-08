// 31. Next Permutation

import java.util.Arrays;

public class ID31 {
  public static void main(String args[]) {
    ID31 solution = new ID31();
    int[] arr = { 1, 2, 3 };
    solution.nextPermutation(arr);
    System.out.println(Arrays.toString(arr)); // Output: [1, 3, 2]
  }

  public void nextPermutation(int[] arr) {
    int index = -1;
    int len = arr.length;

    // Find the first decreasing element from the end
    for (int i = len - 2; i >= 0; i--) {
      if (arr[i] < arr[i + 1]) {
        index = i;
        break;
      }
    }
    // If no such element is found, reverse the entire array
    if (index == -1) {
      reverse(arr, 0, len - 1);
      return;
    }
    // Find the next greater element to swap with
    for (int i = len - 1; i > index; i--) {
      if (arr[i] > arr[index]) {
        int temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
        break;
      }
    }
    // Reverse the subarray after the index
    reverse(arr, index + 1, len - 1);
  }

  // Helper method to reverse a portion of the array
  void reverse(int[] arr, int start, int end) {
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
}