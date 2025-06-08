// 122. Best Time to Buy and Sell Stock II

public class ID122 {
  public static void main(String args[]) {
    ID122 solution = new ID122();
    int[] prices = { 7, 1, 5, 3, 6, 4 };
    System.out.println(solution.maxProfit(prices)); // Output: 7
    prices = new int[] { 100, 180, 260, 310, 40, 535, 695 };
    System.out.println(solution.maxProfit(prices)); // Output: 865
  }

  public int maxProfit(int[] prices) {
    int totalProfit = 0;
    int buy = -1;
    int sell = -1;
    int n = prices.length;
    for (int i = 0; i < n - 1; i++) {
      if (buy == -1 && prices[i] < prices[i + 1]) {
        buy = prices[i];
      }
      if (buy != -1 && sell == -1 && prices[i] > prices[i + 1]) {
        sell = prices[i];
        totalProfit += sell - buy;
        buy = -1;
        sell = -1;
      }
    }
    if (buy != -1) {
      sell = prices[n - 1];
      totalProfit += sell - buy;
    }
    return totalProfit;
  }
}