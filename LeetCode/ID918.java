// 918. Maximum Sum Circular Subarray

public class ID918 {
  public static void main(String[] args) {
    ID918 solution = new ID918();
    int[] arr = { 1, -2, 3, -2 };
    int output = solution.maxSubarraySumCircular(arr);
    System.out.println(output);
  }

  int maxSubarraySumCircular(int[] nums) {
    int max = nums[0];
    int min = nums[0];
    int currMinSum = 0;
    int currMaxSum = 0;
    int totalSum = 0;
    for (int i = 0; i < nums.length; i++) {
      currMaxSum = Math.max(currMaxSum + nums[i], nums[i]);
      max = Math.max(currMaxSum, max);

      currMinSum = Math.min(currMinSum + nums[i], nums[i]);
      min = Math.min(min, currMinSum);

      totalSum += nums[i];
    }

    int normalSum = max;
    int circularSum = totalSum - min;

    if (min == totalSum)
      return normalSum;
    return Math.max(normalSum, circularSum);
  }
}