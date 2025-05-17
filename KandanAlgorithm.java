// For finding the maximum sum of subarray from a given array

import static java.lang.Math.max;

public class KandanAlgorithm {
    public static void main(String[] args) {
        int[] arr = { -1, -2, -4, -5, -9 };
        int maxSum = maxSumSubArray(arr);
        System.out.println("Maximum sum: " + maxSum);
    }

    private static int maxSumSubArray(int[] arr) {
        int currentSum = 0, maxSum = arr[0];
        for (int elem : arr) {
            currentSum += elem;
            maxSum = max(currentSum, maxSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
