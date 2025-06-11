public class ID152 {
  public static void main(String args[]) {
    Solution solution = new Solution();
    int[] arr = { 2, 3, -2, 4 };
    System.out.println(solution.maxProduct(arr));
  }
}

class Solution {
  public int maxProduct(int[] arr) {
    int n = arr.length;
    int product = arr[0];
    int min = arr[0];
    int max = arr[0];
    for (int i = 1; i < n; i++) {
      int temp = Math.max(arr[i], Math.max(arr[i] * min, arr[i] * max));
      min = Math.min(arr[i], Math.min(arr[i] * min, arr[i] * max));
      max = temp;
      product = Math.max(product, max);
    }
    return product;
  }
}