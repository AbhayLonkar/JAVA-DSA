// 121. Best Time to Buy and Sell Stock

/*
 * Solved using Kadanes Algorithm
 * 
 */

public class ID121 {
  public static void main(String args[]) {
    int[] prices = { 7, 1, 5, 3, 6, 4 };
    System.out.println(maxProfit(prices));
  }

  static int maxProfit(int[] prices) {
    int buy = prices[0];
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] < buy) {
        buy = prices[i];
      } else if (prices[i] - buy > profit) {
        profit = prices[i] - buy;
      }
    }
    return profit;
  }

}