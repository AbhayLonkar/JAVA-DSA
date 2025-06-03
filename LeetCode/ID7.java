// 7. Reverse Integer

public class ID7 {

  public static void main(String args[]) {
    int x = -123;
    System.out.println(reverse(x)); // Output: -321
  }

  static int reverse(int x) {
    int res = 0;
    boolean isNegative = x < 0;
    String strX = String.valueOf(Math.abs(x));
    StringBuilder sb = new StringBuilder(strX).reverse();

    try {
      res = Integer.parseInt(sb.toString());
    } catch (NumberFormatException e) {
      return 0;
    }

    return isNegative ? -res : res;
  }
}