// 26. Remove Duplicates from Sorted Array

public class ID26 {
  public static void main(String[] args) {
    int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
    System.out.println(removeDuplicates(arr));
  }

  static int removeDuplicates(int[] arr) {
    int k = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[k] != arr[i]) {
        k++;
        arr[k] = arr[i];
      }
    }
    return k + 1;
  }
}