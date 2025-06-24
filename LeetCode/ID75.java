// 75. Sort Colors

public class ID75 {
  public static void main(String args[]) {
    ID75 obj = new ID75();
    int[] arr = { 2, 0, 2, 1, 1, 0 };
    // obj.sortColors(arr);
    // for (int x : arr) {
    // System.out.print(x + " ");
    // }
    obj.sort012(arr);
    for (int x : arr) {
      System.out.print(x + " ");
    }
    // Output: 0 0 1 1 2 2
  }

  // Approach 1: Count the number of 0s, 1s, and 2s, then fill the array
  // accordingly.
  // Time Complexity: O(n)
  // Space Complexity: O(1)
  // Note: This is not the optimal solution, but it is simple and easy to
  // understand
  public void sortColors(int[] arr) {
    int c0 = 0;
    int c1 = 0;
    int c2 = 0;
    for (int x : arr) {
      if (x == 0)
        c0++;
      else if (x == 1)
        c1++;
      else
        c2++;
    }
    int i = 0;
    while (i < c0) {
      arr[i] = 0;
      i++;
    }
    while (i < c0 + c1) {
      arr[i] = 1;
      i++;
    }
    while (i < c0 + c1 + c2) {
      arr[i] = 2;
      i++;
    }
  }

  // Approach 2: Dutch National Flag Problem
  // Time Complexity: O(n)
  // Space Complexity: O(1)
  // Note: This is the optimal solution, as it sorts the array in a single pass
  // using three pointers (low, mid, high).
  public void sort012(int[] arr) {
    int low = 0;
    int mid = 0;
    int high = arr.length - 1;

    while (mid <= high) {
      if (arr[mid] == 0) {
        swap(arr, low, mid);
        low++;
        mid++;
      } else if (arr[mid] == 1) {
        mid++;
      } else {
        swap(arr, mid, high);
        high--;
      }
    }

  }

  public void swap(int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

}