// 268. Missing Number
package LeetCode;

public class ID268 {

  public static void main(String[] args) {
    int[] arr = { 3, 0, 1 };
    System.out.println(missingNumber(arr));
  }

  static int missingNumber(int[] nums) {
    int sum = 0;
    int finalSum = nums.length * (nums.length + 1) / 2;
    for (int x : nums) {
      sum += x;
    }
    return finalSum - sum;
  }
}
