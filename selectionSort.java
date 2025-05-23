import java.util.Arrays;

public class selectionSort {
  public static void main(String args[]) {
    int[] arr = { 99, 245, 38, 32, 7, 7, 2, 9, 1, 2, 0, -34, 98, 57, 24 };
    selection_sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  // Finds the largest element in an array and replace it with last element of
  // that iteration
  static void selection_sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int last = arr.length - i - 1;
      int max = getMaxIndex(arr, 0, last);
      swap(arr, max, last);
    }
  }

  // Finds the index of largest elements in an array
  static int getMaxIndex(int[] arr, int start, int last) {
    int index = start;
    for (int i = 0; i <= last; i++) {
      if (arr[i] > arr[index]) {
        index = i;
      }
    }
    return index;
  }

  // Swaps the elements of a given array
  static void swap(int[] arr, int max, int last) {
    int temp = arr[max];
    arr[max] = arr[last];
    arr[last] = temp;
  }
}
