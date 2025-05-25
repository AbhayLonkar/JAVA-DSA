// Cyclic sort with time complexity of O(n)
/*
 * We can perform cyclic sort only when we have given an array with elements from 1 to n (sorted or unsorted order)
 * For every elements, the sorted position would be --> index = (value-1) 
 * 
 *  UNSORTED ARRAY
 *  INDEX -->   0 1 2 3 4
 *  VALUES -->  5 4 3 2 1
 * 
 *  SORTED ARRAY
 *  INDEX -->   0 1 2 3 4 
 *  VALUES -->  1 2 3 4 5   
 */

import java.util.Arrays;

public class CyclicSort {
  public static void main(String args[]) {
    int[] arr = { 1, 4, 3, 2, 5, 7, 6, 8 };
    cyclic_sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void cyclic_sort(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int index = arr[i] - 1;
      // if element is not at correct index swaps it with correct index element
      if (arr[index] != arr[i]) {
        swap(arr, i, index);
      } else {
        i++;
      }
    }
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}