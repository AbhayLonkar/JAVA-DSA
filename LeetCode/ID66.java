// 66. Plus One

import java.util.Arrays;

public class ID66 {

  public static void main(String[] args) {
    int[] digits = { 1, 2, 3 };
    System.out.println(Arrays.toString(plusOne(digits))); // Output: [1, 2, 4]
  }

  static int[] plusOne(int[] digits) {
    int len = digits.length;
    if (len == 0)
      return digits;
    for (int i = len - 1; i >= 0; i--) {
      if (digits[i] + 1 != 10) {
        digits[i] += 1;
        return digits;
      }
      digits[i] = 0;
    }

    int[] newDigits = new int[len + 1];
    newDigits[0] = 1;
    return newDigits;
  }
}
