// 11. Container With Most Water

public class ID11 {
  public static void main(String[] args) {
    ID11 solution = new ID11();
    int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    int result = solution.maxArea(height);
    System.out.println("Maximum water that can be stored: " + result); // Expected output: 49
  }

  public int maxArea(int[] height) {
    int maximumWater = 0;
    int start = 0;
    int end = height.length - 1;
    while (start < end) {
      int min = Math.min(height[start], height[end]);
      int currStoredWater = min * (end - start);
      maximumWater = Math.max(maximumWater, currStoredWater);
      if (height[start] < height[end])
        start++;
      else
        end--;
    }
    return maximumWater;
  }
}
