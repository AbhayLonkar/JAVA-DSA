// 135. Candy

import java.util.Arrays;

public class ID135 {
  public static void main(String args[]) {
    int[] ratings = { 1, 0, 2 };
    System.out.println(candy(ratings)); // Output: 5
  }

  static int candy(int[] ratings) {
    if (ratings.length == 0)
      return 0;
    if (ratings.length == 1)
      return 1;
    int[] candies = new int[ratings.length];
    Arrays.fill(candies, 1);
    for (int i = 1; i < ratings.length; i++) {
      if (ratings[i] > ratings[i - 1]) {
        candies[i] = candies[i - 1] + 1;
      }
    }

    for (int i = ratings.length - 2; i >= 0; i--) {
      if (ratings[i] > ratings[i + 1]) {
        if (candies[i + 1] + 1 > candies[i])
          candies[i] = candies[i + 1] + 1;
      }
    }

    int sum = 0;
    for (int x : candies) {
      sum += x;
    }
    return sum;
  }

}
