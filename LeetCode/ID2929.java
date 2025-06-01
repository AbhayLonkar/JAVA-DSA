// 2929. Distribute Candies Among Children II

public class ID2929 {
  public static void main(String[] args) {
    // Case 1: n = 5, limit = 2
    // int n = 5;
    // int limit = 2;

    // Case 2: n = 3, limit = 3
    int n = 3;
    int limit = 3;
    System.out.println(distributeCandies2(n, limit)); // Output: 3
  }

  // Brute Force Approach (Time Exceeded Warning)
  static long distributeCandies1(int n, int limit) {
    long ways = 0;
    for (int ch1 = 0; ch1 <= Math.min(n, limit); ch1++) {
      for (int ch2 = 0; ch2 <= Math.min(n - ch1, limit); ch2++) {
        for (int ch3 = 0; ch3 <= Math.min(n - ch1 - ch2, limit); ch3++) {
          if (ch1 + ch2 + ch3 == n) {
            ways++;
          }
        }
      }
    }
    return ways;
  }

  // Optimized Approach
  static long distributeCandies2(int n, int limit) {
    long ways = 0;
    int minCh1 = Math.max(0, n - 2 * limit);
    int maxCh1 = Math.min(n, limit);
    for (int i = minCh1; i <= maxCh1; i++) {
      int remaining = n - i;
      int minCh2 = Math.max(0, remaining - limit);
      int maxCh2 = Math.min(remaining, limit);
      ways += (maxCh2 - minCh2 + 1);
    }
    return ways;
  }
}